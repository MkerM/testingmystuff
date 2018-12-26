
import javax.swing.JOptionPane;

public class ObjectQuizz {

    public static void main(String args[]) {
        String name = JOptionPane.showInputDialog(null, "Enter name:"),
                street = JOptionPane.showInputDialog(null, "Enter street:"),
                city = JOptionPane.showInputDialog(null, "Enter city:"),
                state = JOptionPane.showInputDialog(null, "Enter state:");

        //<editor-fold defaultstate="collapsed" desc="comment">
        int insuNum = Integer.parseInt(JOptionPane.showInputDialog(null, "enter Insurance Num:")),
                insuAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "enter Insurance Amount:"));
//</editor-fold>
        Employee employee = new Employee(name, street, city, state);
        System.out.println(employee.toString());
    }
}

class Employee {

    String name;
    Address addressInfo;
    InsuInfo insu;

    Employee(String name, String street, String city, String state) {
        this.name = name;
        addressInfo = new Address(street, city, state);
        insu = new InsuInfo();
    }

    @Override
    public String toString() {
        String string = "Name:" + name;
        string += "\nStreet:" + addressInfo.getStreet();
        string += "\nCity:" + addressInfo.getCity();
        string += "\nState:" + addressInfo.getState();
        if(insu.getInsuNum()!=0)string += "\nInsu Num:" + insu.getInsuNum();
        if(insu.getInsuAmount()!=0)string += "\nInsu Amount:" + insu.getInsuAmount();
        return string;
    }

}

class Address {

    private String street;
    private String city;
    private String state;

    Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }
}

class InsuInfo {

    private int insuNum;
    private int insuAmount;

    InsuInfo() {
    }

    InsuInfo(int insuNum, int insuAmount) {
        this.insuNum = insuNum;
        this.insuAmount = insuAmount;
    }

    public void setInsuNum(int insuNum) {
        this.insuNum = insuNum;
    }

    public void setInsuAmount(int insuAmount) {
        this.insuAmount = insuAmount;
    }
    
    public int getInsuNum() {
        return this.insuNum;
    }
    public int getInsuAmount() {
        return this.insuAmount;
    }

}

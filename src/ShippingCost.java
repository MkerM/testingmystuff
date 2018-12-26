
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;


public class ShippingCost {
    public static void main(String args[]){
     int d = parseInt(JOptionPane.showInputDialog(null, "enter the weight"));
        
         if(d>0&&d<=1) JOptionPane.showMessageDialog(null, "3.5 pounds");
         if(d>1&&d<=3) JOptionPane.showMessageDialog(null, "5.5 pounds");
         if(d>3&&d<=10) JOptionPane.showMessageDialog(null, "8.5 pounds");
         if(d>10&&d<=20) JOptionPane.showMessageDialog(null, "10.5 pounds");
         else JOptionPane.showMessageDialog(null, "Cannot be shipped");
         
    }
    
}


import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;


public class FutureDayOfTheWeek {
    static String getDay(int s){
            switch(s){
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wendsday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
                 
        }
            return null;
           
    }
    public static void main(String args[]){
        int d   = parseInt(JOptionPane.showInputDialog(null, "enter day of week"));
        int num = parseInt(JOptionPane.showInputDialog(null, "how many days"));
        int w = 
        
        while(num>6){
            num-=7;
        }
        int nd = d +num;
        String newDay = getDay(nd), 
               day = getDay(d);
        JOptionPane.showMessageDialog(null, "today is "+day+" and the future day is "+newDay);
    }
}

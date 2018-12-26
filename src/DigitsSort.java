
import javax.swing.JOptionPane;

public class DigitsSort {
    public static void main(String[]  args) throws InterruptedException{
       CharSequence x = Integer.toString(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter int to sort")));
        String zero="",
           one="",
           two="",
           three="",
           four="",
           five="",
           six="",
           seven="",
           eight="",
           nine="";
        for(int i =0; i<x.length();i++){
            switch(x.charAt(i)){
                case '0':zero+="0";break;
                case '1':one+="1";break;
                case '2':two+="2";break;
                case '3':three+="3";break;
                case '4':four+="4";break;
                case '5':five+="5";break;
                case '6':six+="6";break;
                case '7':seven+="7";break;
                case '8':eight+="8";break;
                case '9':nine+="9";break;
           
            }
          
                    
        }
        System.out.println(zero+one+two+three+four+five+six+seven+eight+nine);
       
     }
}

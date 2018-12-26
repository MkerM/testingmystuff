
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ReadsInt {
    public static void main(String args[]){
      int max=0;
        for(;;){
            int in = Integer.parseInt(JOptionPane.showInputDialog(null, "enter number"));
           max = in>max?in:max;
            if(in==0)break;
        }
        System.out.println(max);
        
        strnig str1=s.nextline();
         scanner s2 =new scanner (str1);
         int count = 0 
             while (s2.hasnext()){
                     s2.next();
                     count++;
                     
     }
             System.out.println(count);
    }


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amoodaa
 */
public class HighestMark {
    public static void main(String[] args){
    int num = 0; 
    num = Integer.parseInt(JOptionPane.showInputDialog(null, "enter number of students"));
    int max=0,temo=0;
    String maxName="";
    String tem;
    for(;num>0;num--){
      tem = JOptionPane.showInputDialog(null,"enter name");
      temo = Integer.parseInt(JOptionPane.showInputDialog(null, "enter mark"));
     if(temo > max){
            maxName = tem;
            max = temo;
            }
        }
    JOptionPane.showMessageDialog(null, "1st student is "+maxName +" and his mark is "+String.valueOf(max));
    }
}

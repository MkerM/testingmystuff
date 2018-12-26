/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amoodaa
 */
public class TenPerLine {
    public static void main(String[] args){
        int arr[]=new int[32];
        boolean fiveIsGood=false;
        boolean sixIsGood=false;
        int j=-1,i;
        for(i=100;i<=200;i++){
        sixIsGood=false;fiveIsGood=false;
        if(i%5==0) fiveIsGood=true;
        if(i%6==0) sixIsGood=true;
        if(fiveIsGood&&sixIsGood) continue;
        if(fiveIsGood||sixIsGood) arr[++j]=i;
        }
        
       for(i=0;i<arr.length;){
           for(j=0;j<10;j++) if(i<arr.length)System.out.print(arr[i++]+" ");
           System.out.println("");
           }
       }
    }


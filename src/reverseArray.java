
import java.util.Arrays;


public class reverseArray {
     public static void main(String[]  args){
     int[] arr = new int[6];
     for(int i=0; i<arr.length;i++) arr[i]=i+1;
     int t;
     for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
         t=arr[i];
         arr[i]=arr[j];
         arr[j]=t;
         
        }
         System.out.println(Arrays.toString(arr));
     
    }
}

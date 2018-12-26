
import java.util.Scanner;


public class bestGrading {
    public static void main(String[]  args){
        System.out.println("Enter number of students:");
        Scanner input = new Scanner(System.in);
        
        int num, best = 0;
        num = input.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            System.out.println("Enter mark for Student #"+i+":");
            arr[i] = input.nextInt();
            if(arr[i]>best) best = arr[i];
        }
      
        for (int i=1;i<=num;i++){
            if(best - arr[i-1] <= 10) System.out.println("#"+ i + " " + arr[i-1] + " A"); 
            else
            if(best - arr[i-1] <= 20) System.out.println("#"+ i + " " + arr[i-1] + " B");
            else
            if(best - arr[i-1] <= 30) System.out.println("#"+ i + " " + arr[i-1] + " C");
            else
            if(best - arr[i-1] <= 40) System.out.println("#"+ i + " " + arr[i-1] + " D");
            else
           System.out.println("#"+ i + " " + arr[i-1] + " F");
        }
    }
}

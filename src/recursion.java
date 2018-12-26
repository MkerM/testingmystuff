public class recursion{
    public static void main(String[] args){
         int n = 10;
    printHelloWorld_ntimes(n);
    }
    public static void printHelloWorld_ntimes(int n){
    if(n>0){
    System.out.println("helloWorld");
     printHelloWorld_ntimes(n-1);
        System.out.println(n);
        }
   }
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("enter the no:");
        int num=Scan.nextInt();
        if(num%2==0) {
            System.out.println("number is even");
            
        }
        else{
            System.out.println("number is odd");
            
        }
    }    
}

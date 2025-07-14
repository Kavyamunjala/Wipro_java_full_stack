// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Npo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = scan.nextInt();
    if (a>0) {
        System.out.println("Positive");
    }
    else if(a<0) {
        System.out.println("Negative"); 
    } 
    else {
        System.out.println("0");
    }
    }
}

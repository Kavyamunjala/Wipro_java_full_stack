// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Caliculatordouble{
    public static double powerInt(double num1,double num2){
        double result=1;
        for(double i=1;i<=num2;i++){
            result*=num1;
        }
        return result;
        
    }
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        System.out.println("enter the num1:");
        double num1=Scan.nextInt();
        System.out.println("enter the num2:");
        double num2=Scan.nextInt();
        double result=Caliculatordouble.powerInt(num1,num2);
        System.out.println(result);
        
    }
}

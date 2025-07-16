import java.util.Scanner;
class LanguageBasics3{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the num1:");
        int a=scan.nextInt();
        System.out.println("enter the num2:");
        int b=scan.nextInt();
        int c=a+b;
        System.out.println("The sum of " +a+" and " +b+ " is "+c);
    }
    
}
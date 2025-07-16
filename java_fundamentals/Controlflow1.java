import java.util.Scanner;
class Controlflow1{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the num1:");
        int a=scan.nextInt();
        System.out.println("enter the num2:");
        int b=scan.nextInt();
        if(a%10==b%10){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
}
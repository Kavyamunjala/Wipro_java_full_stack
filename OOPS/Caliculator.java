import java.util.Scanner;
class Caliculator{
    public static int powerInt(int num1,int num2){
        int result=1;
        for(int i=1;i<=num2;i++){
            result*=num1;
        }
        return result;
        
    }
    public static void main(String[] args) {
    int num1=2;
    int num2=5;
    int result=Caliculator.powerInt(num1,num2);
    System.out.println(result);
    }
        
}

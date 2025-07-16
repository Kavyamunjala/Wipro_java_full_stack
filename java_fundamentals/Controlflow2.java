import java.util.Scanner;
class Controlflow2{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string:");
        String a=scan.nextLine();
        String[] b=a.split(" ");
        if(a.length()==0){
            System.out.println("no values");
        }
        else{
            System.out.println(String.join(",",b));
        }
    }    

}
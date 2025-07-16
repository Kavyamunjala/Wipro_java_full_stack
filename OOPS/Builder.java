// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Builder{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("MOM");
        String String1=sb.reverse().toString();
        if(String1.equals("MOM")){
            System.out.println("it is a palidrome");
            
        }
        else{
            System.out.println("it is not a palidrome");
            
        }
        
    }
}
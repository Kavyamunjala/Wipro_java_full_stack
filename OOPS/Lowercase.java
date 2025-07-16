
public class Lowercase {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Mark");
        String String1=sb.append("Ate").toString();
        String String2=String1.toLowerCase().toString();
       
        System.out.println(String2);
    }
}
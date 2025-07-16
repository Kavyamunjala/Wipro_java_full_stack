public class Firsthalf{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("NEHAGOUD");
        int sb1=sb.length();
        if(sb1%2==0){
            int halflength=sb.length()/2;
            System.out.println(sb.substring(0,sb1/2));
        }
        else{
            System.out.println("null");

        }
    }
}
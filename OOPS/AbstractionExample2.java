
public class AbstractionExample2 {
    public static void main(String[] args) {
        vehicle car=new car();
        car.start();
    }
}
interface vehicle{
    void start();
}
class car implements vehicle{
    public void start(){
        System.out.println("car is starting..");
    }
}
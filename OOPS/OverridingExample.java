// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class OverridingExample{
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();
    }
    
}
class Animal{
    void sound(){
        System.out.println("animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("dog barks");
    }
}
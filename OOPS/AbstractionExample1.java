// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class AbstractionExample1{
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.makeSound();
        dog.sleep();
    }
}
abstract class Animal {
    abstract void makeSound();
    void sleep(){
        System.out.println("sleeping...");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("dog barks");
    }
}

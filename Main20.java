//abstraction in java
abstract class animal{
    public abstract void sound();

}
class Dog extends animal{
    public void sound(){
        System.out.println("i am converted to abstract method to normal method");
    }
}
public class Main20 {
    public static void main(String[]args){
        Dog obj = new Dog();
        obj.sound();
    }
}

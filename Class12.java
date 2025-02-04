class Animal{
    public static void barking(){
        System.out.println("Dog is barking");

    }
}
class behaviour extends Animal {
    public static void eating() {
        System.out.println("Dog is eating");


    }
}
public class Class12 {
    public static void main(String[]args){
        behaviour obj1= new behaviour();
        obj1.eating();
        obj1.barking();
    }
}
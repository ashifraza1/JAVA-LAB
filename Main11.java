class parent{
    public static void parent1(){
        System.out.println("parent method");

    }
}
class Child extends parent {
    public static void Child1() {
        System.out.println("Child method");


    }
}
public class Main11 {
    public static void main(String[]args){
        Child obj = new Child();
        obj.parent1();
        obj.Child1();
    }
}

class Parent{
    Parent(){
        System.out.println("Parent class constructor");
    }
        void parent1(){
        System.out.println("Parent class method");
    }

}
class child extends Parent {
    child(){
        super();
        System.out.println("Child class constructor");
    }
    void child1(){
    super .parent1();
    System.out.println("Child class method");
    }

}
public class Main15{
    //int a = 150;
    public static void main(String[]args){
        //Main obj = new Main();
        //System.out.println("a value :" +a);
        Child obj = new Child();
        //obj.parent1();
        obj.Child1();

    }
}
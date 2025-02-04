abstract class Animal1{
    public abstract void sound();

}
class Cat extends Animal1{
    public void sound(){
        System.out.println("meow meow.....!!");
    }
}
class Main21{
    public static void main(String[]args){
        Cat obj = new Cat();

    }
}





class fruit{
    public static void colour(){
        System.out.println("colour of an apple is red ");

    }
}
class shape extends fruit {
    public static void sweet() {
        System.out.println("Apple is sweet");



    }
}
public class Main14 {
    public static void main(String[]args){
        System.out.println("sweet");
        System.out.println("price;is 50rs");
         shape obj1= new shape();

        obj1.sweet();
        obj1.colour();
    }
}

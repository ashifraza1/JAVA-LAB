class Car1{
    public  void car_model(){

        System.out.println( "model");
    }

}
class BMW extends Car1 {
    public void car_price() {
        System.out.println("car price");
    }
}
public class Fifa {
    public static void main(String[] args) {
        System.out.println("car details");
        System.out.println("-------------");
        BMW obj = new BMW();

        obj.car_model();
        obj.car_price();

    }
}







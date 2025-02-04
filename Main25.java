//implementation-3using flowers Details  for Abstraction:
abstract class flowers{
    String flower_name;
    String flower_color;
    String flower_price;
    String flower_size;
    String flower_smell;
    public abstract void flower_details();//abstract method
}
class Rose extends flowers {
    public void flower_details() {//normal method
        this.flower_name = "Rose";
        this.flower_color="Red";
        this.flower_price = "100 rs";
        this.flower_size = "2.5cm";
        this.flower_smell = "sweet floral";

        System.out.println("flowers_details");
        System.out.println("______________");
        System.out.println("flower name is:" + this.flower_name);
        System.out.println("flower color is:" + this.flower_color);
        System.out.println("flower price is:" + this.flower_price);
        System.out.println("flower size is:" + this.flower_size);
        System.out.println("flower smell is:" + this.flower_smell);


    }
}
public class Main25 {
    public static void main(String[] args) {
        Rose obj = new Rose();
        obj.flower_details();

    }

}





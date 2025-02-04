abstract class Animal2 {
    public abstract void dog_details();
}
class dog1 extends Animal2 {
    public void dog_details() {
        System.out.println("Dog_details");
        System.out.println("_______________");
        System.out.println("Dog_name:Mickkky");
        System.out.println("Dog_breed:German shephard");
        System.out.println("Dog_price:12 thousand");
        System.out.println("Dog_location:UAE");
        System.out.println("Dog_owner_details:johns");
    }
}
class Main22{
    public static void main(String[]args){
        dog1 obj = new dog1();
        obj.dog_details();
    }
}
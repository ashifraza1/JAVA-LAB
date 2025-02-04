abstract class Animal4   {
    public abstract void dog_details();
}
class dog2 extends Animal4{
    public void dog_details() {
        String dog_name="Morni";
        System.out.println("Dog_details");
        System.out.println("_______________");
        System.out.println("Dog_name:"+dog_name);
        System.out.println("Dog_breed:German shephard");
        System.out.println("Dog_price:12 thousand");
        System.out.println("Dog_location:UAE");
        System.out.println("Dog_owner_details:johns");
    }
}
class Main23{
    public static void main(String[]args){
        dog2 obj = new dog2();
        obj.dog_details();
    }
}










//vehicle example car
class vehicles{//parent or super class
    public static void car_company(){
        System.out.println("car company is:Benz");

    }
}
class car extends vehicles{
    public static void car_type() {
        System.out.println("mecedes car");
        System.out.println("model name:g wagon");


    }
}
public class Main13{

    public static void main(String[]args){     
        System.out.println("Car detail");
        System.out.println("===========");
        car obj = new car();

        obj.car_company();
        obj.car_type();

    }
}






















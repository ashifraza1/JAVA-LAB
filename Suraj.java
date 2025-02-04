class Vehicle{
    public static void Vehicle_type(){
        System.out.println("Vehicle type");
    }
}
class Car extends Vehicle{
    public static void car_type(){
        System.out.println("Mercedes Car");
        System.out.println("Model : G Wagon");
    }
}
class car1 extends Vehicle{
    public static void car1_type(){
        System.out.println("Volkswagen Car");
        System.out.println("Model : West fall camper");
    }

}
class car2 extends Vehicle{
    public static void car2_type(){
        System.out.println("Rolls Royce Car");
        System.out.println("Model : Sab ka baap");
    }
}
public class Suraj{

    public static void main(String[] args) {

        Car obj = new Car();
        car1 obj1 = new car1();
        car2 obj2 = new car2();
        obj.Vehicle_type();

        System.out.println("Car Details");
        System.out.println("=======");

        obj.Vehicle_type();
        obj.car_type();

        System.out.println("======");

        obj.Vehicle_type();
        obj1.car1_type();
        System.out.println("======");

        obj.Vehicle_type();
        obj2.car2_type();
    }
}


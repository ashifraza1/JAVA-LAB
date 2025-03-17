
class Child1 extends Thread { // child class extends Thread

    // Overriding the run method
    public void run() {
        // Animal 1
        String animal_name = "Dog";
        System.out.println("Animal name: " + animal_name);
        String animal_price = "2000";
        System.out.println("Animal price: " + animal_price);
        String animal_age = "5 years";
        System.out.println("Animal Age: " + animal_age);

        // Animal 2
        String animal_name2 = "Tiger";
        System.out.println("Animal name: " + animal_name2);
        String animal_price2 = "100000";
        System.out.println("Animal price: " + animal_price2);
        String animal_age2 = "20 years";
        System.out.println("Animal Age: " + animal_age2);
        // Animal3
        String animal_name3 = "Lion";
        System.out.println("Animal name: " + animal_name3);
        String animal_price3 = "100000";
        System.out.println("Animal price: " + animal_price3);
        String animal_age3 = "20 years";
        System.out.println("Animal Age: " + animal_age3);
    }

}

public class AnimalThreads {
    public static void main(String[] args) {
        // Create an instance of the child class
        Child1 c = new Child1();
        // Start the thread
        c.start();
        c.run();
    }
}


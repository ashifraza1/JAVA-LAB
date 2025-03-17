class Animal extends Thread {//child or tgread class

    public void animal() {
        String animal_name = "fox";
        String animal_price = "thirty thousand";
        String animal_colour = "Brown";
        double animal_age = 9.7;

        System.out.println("Animal_Details");
        System.out.println("___________");
        System.out.println("Animal name:"+animal_name);
        System.out.println("Animal_Price:"+animal_price);
        System.out.println("Animal Colour:"+animal_colour);
        System.out.println("Animal Age:"+animal_age);

    }

}


public class AnimalThreads1 {
    public static void main(String[]args){
        Animal n = new Animal();
        n.start();
        n.run();

    }
}

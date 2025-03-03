//Animals list using scanner class:
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class AnimalN {
    public static void main(String[]args) {
        List<String> Animals = new ArrayList<>();//creating empty list
        Scanner s = new Scanner(System.in);//creating scanner class
        while(true) {
            System.out.println("Enter Animals name:(type 'done'to finish)");


            String animals = s.nextLine();

            if (animals.equalsIgnoreCase("done")) {
                   break;
            }

            Animals.add(animals);

        }
            System.out.println("Enter Animals name:"+Animals);










    }

}

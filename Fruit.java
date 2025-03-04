//Collection in java:sets in java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
class fruit{
    public static void main(String[]args){
        Set<String>fruits=new HashSet<>();//Creating empty fruits set

        System.out.println("FRUIT_DETAIL");
        System.out.println("______________");
        System.out.println("FRUIT(before) :"+fruits);

        Scanner s = new Scanner(System.in);//creating scanner class
        while(true){
            System.out.println("Enter fruits name:(type 'done' to finish)");
            String f =  s.nextLine();

            if(f.equalsIgnoreCase("done")){
                break;
            }

            fruits.add(f);
        }
        System.out.println("FRUITS:"+fruits);
    }
}
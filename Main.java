//Collection in java:sets in java
import java.util.Set;
import java.util.HashSet;
class main{
    public static void main(String[]args){
        Set<String>fruits=new HashSet<>();//Creating empty fruits set

        fruits.add("Cherry");
        fruits.add("Grapes");
        fruits.add("Mangoes");
        fruits.add("Cherry");

        System.out.println("FRUIT :"+fruits);
    }
}

import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = s.nextInt();
        if (n >= 0 && n <= 9) {
            System.out.println("1 digit");
        } else if (n >= 0 && n <= 100) {
            System.out.println("2 digit");
        } else if (n >= 100 && n <= 999) {
            System.out.println("3 digit");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
public class Main6 {
    static void method() {
        System.out.println("This is method 2");

    }

    int sub(int a, int b) {
        return a - b;

    }

    public static void main(String[] args) {
        method();
        Main6 obj = new Main6();
        obj.method ();
        System.out.println(obj.sub(10, 20));
    }

}
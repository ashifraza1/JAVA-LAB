public class Main8 {
    static void method() {
        System.out.println("This is method 2");

    }

    int div(int a, int b) {
        return a % b;

    }

    public static void main(String[] args) {
        method();
        Main8 obj = new Main8();
        obj.method ();
        System.out.println(obj.div(10, 20));
    }

}


public class Main7 {
    static void method() {
        System.out.println("This is method 2");

    }

    int mul(int a, int b) {
        return a * b;

    }

    public static void main(String[] args) {
        method();
        Main7 obj = new Main7();
        obj.method ();
        System.out.println(obj.mul(10, 20));
    }

}


public class Main9 {

        static void method() {
            System.out.println("This is method 2");

        }

        int div(int a, int b) {
            return a / b;

        }

        public static void main(String[] args) {
            method();
            Main9 obj = new Main9();
            obj.method ();
            System.out.println(obj.div(10, 20));
        }

    }





class Printer { // Parent class

    synchronized void message(String msg) {
        System.out.print("[" + msg);

        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("]");
    }
}

class MyThreads extends Thread { // Child or thread class
    Printer print_msg;
    String msg;

    MyThreads(Printer print_msg, String msg) { // Child constructor
        this.print_msg = print_msg;
        this.msg = msg;
    }

    public void run() {
        print_msg.message(msg);
    }
}

public class Synchronization1 { // Main class
    public static void main(String args[]) {
        Printer p = new Printer();

        MyThreads m1 = new MyThreads(p, "Hi");
        MyThreads m2 = new MyThreads(p, "Good morning");
        MyThreads m3 = new MyThreads(p, "Ashif hussain");
        MyThreads m4 = new MyThreads(p, "Fine");
        MyThreads m5 = new MyThreads(p, "In chandapura");

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
    }
}

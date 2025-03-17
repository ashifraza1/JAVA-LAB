//threads in java

class child extends Thread {//child class

    public void run() {
        System.out.println("This is a run method");

    }
}
public class Main {
    public static void main(String[]args){
        child c = new child();
        c.start();
        c.run();

    }
}
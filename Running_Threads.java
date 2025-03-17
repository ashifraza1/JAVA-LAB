
class Run extends Thread {//child or thread class

    public void runing() {

        for(int i=1;i<5;i++){
        System.out.println("Running......");

        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}


public class Running_Threads { //Main class

    public static void main(String[] args) {
        Run a = new Run();
        a.start();
        a.run();

    }

    }

}
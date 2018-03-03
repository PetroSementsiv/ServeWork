package Lesson12;

public class Threadone implements Runnable {

    @Override
    public void run() {
        Threadtwo two = new Threadtwo();
        Thread two2 =  new Thread(two);
        two2.start();
    }

}

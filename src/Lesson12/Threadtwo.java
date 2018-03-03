package Lesson12;

public class Threadtwo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <3 ; i++) {
            System.out.println("Thread number two!");
        }
        Threadtree three = new Threadtree();
        Thread three3 = new Thread(three);
        three3.start();
    }
}

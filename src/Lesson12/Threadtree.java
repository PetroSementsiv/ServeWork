package Lesson12;

public class Threadtree implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Thread number three");
        }
    }
}


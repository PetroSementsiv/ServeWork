package Lesson12;

public class SecondThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("Hello world!");

        }
    }
}

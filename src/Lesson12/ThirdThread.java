package Lesson12;

public class ThirdThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Peace in the peace");
        }
    }
}
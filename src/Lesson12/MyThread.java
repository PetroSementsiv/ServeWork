package Lesson12;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try{ sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I study Java!");
        }


    }
}

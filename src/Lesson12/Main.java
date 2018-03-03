package Lesson12;

public class Main {
    public static void main(String[] args) throws Exception{

        MyThread t  = new MyThread();
        //  t.start();

       /* SecondThread one = new SecondThread();
        Thread one1 = new Thread(one);
        one1.start();
        one1.join();

        ThirdThread two = new ThirdThread();
        two.start();
        two.join();

        System.out.println("My name is Einstein!");*/

        Threadone one  =  new Threadone();
        Thread one1 =  new Thread(one);
        one1.start();



    }
}

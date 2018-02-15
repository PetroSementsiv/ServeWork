import java.util.Scanner;

public class HomeWork1 {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scaner = new Scanner (System.in);
        System.out.print("What is your name?:");
        String inputA = scaner.next();
        System.out.print("how old are you?:");
        int inputB = scaner.nextInt();


        System.out.println("Hello" +" "+ inputA);
        System.out.println("You are" + inputB + "years old");
    }

}


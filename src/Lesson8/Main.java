package Lesson8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");


        try{
            int a = scanner.nextInt();
            System.out.println("Emter value of b: ");
            int b = scanner.nextInt();

            squareRectangle(a,b);
        } catch (InputMismatchException ex){
            System.err.println("You input non numeric value!");
        }
    }

    public static void squareRectangle(int a1, int b1) {
        try {
            if (a1 < 0 || b1 < 0)

                throw new Exception();
        } catch (Exception e) {
            System.err.println("You can enter only positive values");
            a1=0;
        }
        System.out.println("Area of reactangle is: " + a1*b1);
    }

}

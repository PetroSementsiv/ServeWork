package Lesson8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class homework81 {

    public static void main(String[] args) {


       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");


        double c = 0;
        double a;
        try {
            a = scanner.nextDouble();
            System.out.println("Emter value of b: ");
            double b = scanner.nextDouble();
            c = (a / b);
            if (b == 0) {
                throw new Exception();
            }
        } catch (InputMismatchException ex) {
            System.err.println("You input non numeric value!");

        } catch (Exception e) {
            System.err.println("Division by zero!");
            c = 0.0;
        }
        System.out.println(c);*/

        readNumber(1, 100);
    }

    /* public static void readNumber(int start, int end) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number! ");
         int d = 0;
         try {
             d = input.nextInt();
             if ((d < start) || (d > end)) {
                 try {
                     throw new Exception("Number is not in range!");
                 } catch (Exception e) {
                     System.err.println("Number is not in a range!");
                 }
             }
         } catch (InputMismatchException sw) {
             System.err.println("You have to input integer value!");


         }
         System.out.println(d);

     }

     */
    public static void readNumber(int start, int end) {
        StringBuffer one = new StringBuffer();
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        int d = 0;

        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.print("Enter " + i + " element! ");
                try {
                    arr[i] = input.nextInt();

                    if ((d < start) || (d > end)) throw new Exception();

                } catch (Exception e) {
                    System.err.println("Number is not in a range!");

                }
            } catch (InputMismatchException sw) {
                System.err.println("You have to input integer value!");


                one.append(arr[i]).append(" ");


            }
            System.out.print(one.toString());

        }


    }
}

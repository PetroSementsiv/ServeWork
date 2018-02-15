import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {
            // побудова прямокутного трикутника:
            Scanner scaner = new Scanner(System.in);
            System.out.println("Enter the number:");
            int a = scaner.nextInt();
            for (int i = 0; i < a; i++) {

                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }

                System.out.println("");
   /* Scanner scaner = new Scanner(System.in);
		System.out.print("Enter the number:");
    int input = scaner.nextInt();
		if (input>0) {
        System.out.print("Entered positive"+ " ");
    }
		if (input<0) {
        System.out.print("Enterd negative"+ " ");
    }
		if (input % 2 ==0) {
        System.out.println("even number");
    } else {
        System.out.println("odd number");
    }*/


   /*int sum =0;
		for (int i =1; i<=10; i++) {
        sum = sum+i;
    }
		System.out.println(sum);*/


            }
        }


    }

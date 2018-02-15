import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // побудова рівностороннього трикутника
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = scaner.nextInt();
        for (int i = 0; i < a; i = i + 2) {
            for (int d = 0; d < (a - i) / 2; d++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            System.out.println("");

        }
    }


   /* Scanner scaner = new Scanner(System.in);
		System.out.print("Enter the year:");
    int input = scaner.nextInt();
		if (input % 4 ==0) {
        System.out.println("Entered leap year");
    }
		if(input % 4 !=0 || input % 100 ==0 && !(input %400 ==0)) {
        System.out.println("Entered not leap year");
    }*/



    //sum of series:
  /* Scanner scaner = new Scanner(System.in);
        System.out.println("Enter the number:");
    int a = scaner.nextInt();
    int sum = 0;
        System.out.print("The sum is:");
        for (int i = 0; i < a; i++) {

        for (int j = 0; j < i + 1; j++) {
            sum = 1 + i;

        }
        System.out.print(sum);

    }*/


}

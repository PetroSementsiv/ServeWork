import java.util.Scanner;

public class Lesson1{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // TODO Auto-generated method stub
        Scanner scaner = new Scanner (System.in);
        System.out.print("Enter value a:");
        double inputA = scaner.nextDouble();
        int c = (int) inputA;
        System.out.print("Enter value b:");
        double inputB = scaner.nextDouble();
        int d = (int) inputB;
        System.out.print("Enter value of x:");
        double inputX = scaner.nextDouble();
        System.out.print("Enter string:");
        String inputAns = scaner.next();



        System.out.println("Hello World");
        System.out.println("Integer variable of a:" +  c);
        System.out.println("Integer variable of b:" + d);
        System.out.println("a+b"+"=" + (inputA+inputB));
        System.out.println("a-b" + "=" + (inputA-inputB));
        System.out.println("a*b" + "=" + (inputA*inputB));
        System.out.println("a/b" +"=" +(inputA/inputB));
        System.out.println("How are you?");
        System.out.println("I am" +"  "+ inputAns);
        System.out.println("Квадрат та корінь числа:" + Math.pow(inputX, 2)  + "   "+ Math.sqrt(inputX));
    }
}

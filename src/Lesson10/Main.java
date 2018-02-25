package Lesson10;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> myCollection = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(10) + 1;
            myCollection.add(n);
        }
        System.out.println("myCollection looks: " + myCollection);
        System.out.println();
        System.out.println("newCollection looks: "+ findElemMoreFive(myCollection));
        myCollection.add(2, -1);
        myCollection.add(5,-3);
        myCollection.add(8, -4);
        for (int i = 0; i <myCollection.size() ; i++) {
            System.out.print("[position" + i +", value" +myCollection.get(i) + "]");
        }
        System.out.println();
        Collections.sort(myCollection);
        System.out.println("Sorted collection:" + myCollection);

    }

    public static List<Integer> findElemMoreFive(List<Integer> one) {
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < one.size(); i++) {
            int a = one.get(i);
            if (a > 5) {
                newCollection.add(a);
            }

        }

        return newCollection;
    }
}

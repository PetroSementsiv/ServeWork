package Lesson10;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(2845, "Oleh");
        employeeMap.put(2263, "Ivan");
        employeeMap.put(1418, "Oleksandr");
        employeeMap.put(7475, "Ivan");
        employeeMap.put(7195, "Evhen");
        employeeMap.put(1108, "Oksana");
        employeeMap.put(1659, "Viktor");

        System.out.println(employeeMap);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID:");

        int input = scanner.nextInt();
        if (employeeMap.containsKey(input)) {
            System.out.println(employeeMap.get(input));
        } else {
            System.out.println("You entered false ID!");
        }


        System.out.print("Enter name:");
        String inputName = scanner.next();
        List<Integer> foundIds = new LinkedList<>();
        for (int key : employeeMap.keySet()) {
            if (employeeMap.get(key).equals(inputName)) {
                foundIds.add(key);
            }
        } if(foundIds.isEmpty()) {
            System.out.println("You entered wrong name!");
        } else {
            System.out.println(foundIds);
        }








    }
}

package homework6;

import java.util.Arrays;
import java.util.Comparator;

public class Employee {

    private String employeeId;


    public Employee(String employeeId) {
        super();
        this.employeeId = employeeId;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee[] employees = new Employee[5];
        employees[0] = new SalariedEmployee("225552", 25, 220, "2546");
        employees[1] = new SalariedEmployee("2256", 45, 200, "25366");
        employees[2] = new ContractEmployee("5698", 3800, "2655");
        employees[3] = new ContractEmployee("8569", 4500, "2269985");
        employees[4] = new ContractEmployee("8565899", 7200, "96385");

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (((FaceEmployee)o1).calculatePay() > ((FaceEmployee)o2).calculatePay()) {
                    return 1;
                }
                if( ((FaceEmployee)o1).calculatePay() < ((FaceEmployee)o2).calculatePay()){

                    return -1;}
                else{
                    return 0;
                }
            }
        });
        for (int i = 0; i <employees.length ; i++) {
            System.out.println("employeeId" + employees[i].employeeId  + " ," + ((FaceEmployee)employees[i]).calculatePay());
        }


    }
}



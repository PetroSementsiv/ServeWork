import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Employee {
    private String name;
    private DepartmentName department;
    private int salary;
    static int count = 0;
    static enum DepartmentName {Custom, Finantial, IT, LaborProtection, Commercial}

    public Employee(String name,  DepartmentName department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        count++;
    }






    public static Employee[] createArr() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Vasyl", DepartmentName.Custom, 3200);
        employees[1] = new Employee("Nazar", DepartmentName.Commercial, 3800);
        employees[2] = new Employee("Evhen", DepartmentName.IT, 5500);
        employees[3] = new Employee("Bogdan", DepartmentName.Finantial, 5200);
        employees[4]= new Employee("Ivan", DepartmentName.Custom, 4500);
        return  employees;



    }

    @Override
    public String toString() {
        return count + "Employee" +" "+ name +" "+ "from" +" "+ department +" "+"department with" +" "+ salary;
    }

    public static void main(String[] args) {

        Employee[] employees = createArr();
        Scanner scaner  = new Scanner(System.in);
        System.out.print("Choose department:");
        String input  = scaner.next();
        DepartmentName departmentName = DepartmentName.valueOf(input);


        printEmpByDepartment(employees, departmentName);

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.salary > o2.salary) {
                    return 1;
                }
                if( o1.salary<o2.salary){

                    return -1;}
                else{
                    return 0;
                }
            }
        });

        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.salary > o2.salary) {
                    return -1;
                }
                if( o1.salary<o2.salary){

                    return 1;}
                else{
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(employees));
    }


    public  static void printEmpByDepartment(Employee[] employees, DepartmentName department ){
        for (int i=0; i<employees.length; i++){
            if( department.equals(employees[i].department)){
                System.out.println(employees[i]);
            }

        }
    }


}

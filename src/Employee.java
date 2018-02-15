public class Employee {

    private String name;
    private int rate;
    private static int hours;
    public static int count = 0;
    public static int sum =0;
    public static int the = 0;

    Employee(){
        count++;
    }



    public Employee(String name, int rate) {
        super();
        this.name = name;
        this.rate = rate;
        count++;
    }



    public Employee(String name, int rate, int hours) {
        super();
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        count++;
    }



    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getRate() {
        return rate;
    }


    public void setRate(int rate) {
        this.rate = rate;
    }


    public int getHours() {
        return hours;
    }



    public int setHours(int hours) {
        this.hours = hours;
        return the += hours;
    }

    public static int totalHours() {
        return the+= hours;
    }

    public int salary() {
        return getRate()*getHours();
    }


    @Override
    public String toString() {
        return count + "Employee [name=" + name + ", rate=" + rate + ",  hours="+ hours +"]";
    }

    public void changeRate(int rate) {
        sum -= this.rate;
        this.rate = rate;
        sum += rate;
    }

    public double bonuses() {
        return 0.12*salary();
    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee employee1 = new Employee("Ivan", 15);
        employee1.setHours(245);
        System.out.println(employee1);
        System.out.println("bonuses:"+" "+employee1.bonuses() + "\t"+"salary:" + employee1.salary());
        Employee employee2 = new Employee("Oleh", 18);
        employee2.setHours(250);
        System.out.println(employee2);
        System.out.println("bonuses:"+" "+employee2.bonuses() + "\t"+"salary:" + employee2.salary());
        Employee employee3 = new Employee("Petro", 20, 220);

        System.out.println(employee3);
        System.out.println("bonuses:"+" "+employee3.bonuses() + "\t"+"salary:" + employee3.salary());

        System.out.println("Total hours is:" +" "+Employee.totalHours());
    }

}

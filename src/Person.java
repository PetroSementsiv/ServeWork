import java.util.Calendar;

public class Person {

    private String name;
    private int birthYear;
    public static int count = 0;
    public static int year = Calendar.getInstance().get(Calendar.YEAR);

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    Person(){
        count ++;
    }


    public Person(String name) {
        this.name = name;
        count++;
    }

    public int age() {
        return year - getBirthYear();
    }

    public String info() {
        return (name + "\t"+ Person.count);
    }

    @Override
    public String toString() {
        return count +" "+ "Person [name=" + name + ", birthYear=" + birthYear + "]";
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person person1 = new Person("Ivan");
        System.out.println("Our persons:");
        person1.birthYear = 2000;
        System.out.println(person1);
        System.out.println(person1.age() +"\t"+ "years");
        Person person2 = new Person("Bogdan");
        person2.birthYear = 1975;
        System.out.println(person2);
        System.out.println(person2.age() +"\t"+ "years");
        Person person3 = new Person("Maria");
        person3.birthYear = 1963;
        System.out.println(person3);
        System.out.println(person3.age() +"\t"+ "years");
        Person person4 = new Person("Ivanna");
        person4.birthYear = 1985;
        System.out.println(person4);
        System.out.println(person4.age() +"\t"+ "years");
        Person person5 = new Person("Oleh");
        person5.birthYear = 1988;
        System.out.println(person5);
        System.out.println(person5.age() +"\t"+ "years");



    }


}

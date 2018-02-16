package task62;

public class Main {

    public static void main(String args[]){

        Person[] persons = new Person[6];
         persons[0] = new Student("Ivan");
         persons[1] = new Teachers("Bogdan", 4200);
         persons[2] = new Cleaner("Anna", 2800);
         persons[3] = new Cleaner("Inna", 3000);
         persons[4] = new Teachers("Oleh", 4800);
         persons[5] = new Student("Oleksandr");

        for (int i = 0; i < persons.length ; i++) {
            persons[i].print();
            if (persons[i] instanceof Staff) {
                System.out.println(((Staff)persons[i]).salary());

            }
        }
    }
}

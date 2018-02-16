package task61;

public class Main {



    public static  void main(String[] args) {


        Animal[] animals = new Animal[5];
        animals[0] = new Cat("Sir");
        animals[1] = new Cat("Kit");
        animals[2] = new Dog("Barsik");
        animals[3] = new Dog("Rik");
        animals[4] = new Cat("Man");

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getName() +" "+  animals[i].feed() +" "+ animals[i].voice());

        }

    }
    @Override
    public String toString() {
        return null;
    }

}

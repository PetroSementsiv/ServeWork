package task61;

public class Dog implements Animal {

    private String name;
    @Override
    public String voice() {
        return "Hav-Nav";
    }

    @Override
    public String feed() {
        return "Meet";
    }

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

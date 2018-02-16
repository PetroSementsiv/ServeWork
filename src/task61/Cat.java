package task61;

public class Cat implements Animal {

    private String name;
    @Override
    public String voice() {
        return "Miav-Miav";
    }

    @Override
    public String feed() {
        return "Milk";
    }

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package task62;

public class Cleaner extends Staff {

    public void print(){
        System.out.println("I am a Cleaner " + name);
    }

    @Override
    public int salary() {
        return mounthPay;
    }

    public Cleaner(String name, int mounthPay) {
        super(name, mounthPay);

    }

}

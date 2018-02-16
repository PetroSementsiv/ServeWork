package task62;

public abstract class Staff extends Person {

    public int mounthPay;


    public abstract int salary();



    public Staff(String name, int mounthPay) {
        super(name);
        this.mounthPay = mounthPay;
           }

    public int getMounthPay() {
        return mounthPay;
    }
}

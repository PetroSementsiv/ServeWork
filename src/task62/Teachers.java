package task62;

public class Teachers extends Staff {

    public void print(){
        System.out.println("I am a Teacher " + name);
    }


    @Override
    public int salary() {
        return mounthPay;
    }

    public Teachers( String name,  int mounthPay) {
        super(name, mounthPay);
           }

    @Override
    public int getMounthPay() {
        return mounthPay;
    }
}

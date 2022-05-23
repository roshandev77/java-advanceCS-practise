package encapsulation;

public class EncapsulationDemo {
    public static void main(String args[]) {
        Laptop lp = new Laptop(123456, 34500);
        System.out.println("The price of Laptop:  " + lp.getPrice());
        lp.setPrice(20000);
        System.out.println("Price after change: " + lp.getPrice());
    }
}

class Laptop {
    private long serial_no;
    private int price;

    Laptop(long serial_no, int price) {
        this.serial_no = serial_no;
        this.price = price;
    }

    public long getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(long serial_no) {
        this.serial_no = serial_no;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > this.price) this.price = price;
    }
}

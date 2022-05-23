public class Encapsulation {
    public static void main(String args[]) {

//        in diwali sell --> 48600/-

        EcomWeb eobj = new EcomWeb();
        System.out.println("Old Price:" + eobj.getMobile_price());
        eobj.setMobile_price(48600);
        System.out.println("New Price: " + eobj.getMobile_price());
    }
}

class EcomWeb {
    private int mobile_price = 54000;
    boolean isAdmin = false;

    public int getMobile_price() {
        return mobile_price;
    }

    public void setMobile_price(int mobile_price) {
        if (isAdmin) this.mobile_price = mobile_price;
        else System.out.println("You are not an Admin");
    }
}

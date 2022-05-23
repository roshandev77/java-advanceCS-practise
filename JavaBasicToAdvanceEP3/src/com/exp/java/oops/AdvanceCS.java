package com.exp.java.oops;

class ShoppingMall {
    String name;
    int reg_no;
    String location;

    ShoppingMall(String name, int reg_no, String location) {
        this.name = name;
        this.reg_no = reg_no;
        this.location = location;
    }
    void display() {
        System.out.println("Name " + name + " " + "Reg No " + reg_no + " " + "Location " + location);
    }
}


public class AdvanceCS {
    public static void main(String args[]) {

//        ShoppingMall bigbazaar = new ShoppingMall();
//        bigbazaar.display();

        ShoppingMall dmart = new ShoppingMall("Dmart", 345, "Mumbai");

        ShoppingMall trend = new ShoppingMall("Rel Trend", 567, "Pune");

        dmart.display();
        trend.display();

    }
}

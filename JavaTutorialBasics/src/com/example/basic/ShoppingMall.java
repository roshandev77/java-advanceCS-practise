package com.example.basic;
 public class ShoppingMall {
    String name;
    String location;
    int reg_no;

    ShoppingMall(String name, String location, int reg_no) {
        this.name = name;
        this.location = location;
        this.reg_no = reg_no;

    }

    protected void display() {
        System.out.println("The name is " + this.name + "The location is " + this.location + "The Reg Number is " + this.reg_no);
    }
}

package com.example.basic;
//import com.example.basic.ShoppingMall;

class AdvanceCS {
    int age = 12;
    String name = "Roshan";

    AdvanceCS() {

    }

    void display() {
        System.out.println("Inside Display of AdvanceCS");
    }
}

class MainClass {

    public static void main(String args[]) {
        AdvanceCS acs = new AdvanceCS();
        System.out.println(acs.name);
        acs.display();
    }

}

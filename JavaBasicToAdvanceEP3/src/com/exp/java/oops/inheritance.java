package com.exp.java.oops;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class inheritance {
    public static void main(String args[]) {
       LivingBeing lbObjectHuman = new LivingBeing(2, 2);
       lbObjectHuman.canWalk();

       Human huObj = new Human(2, 2, "male");
       huObj.appearence();


    }
}

class LivingBeing {
    int eyes;
    int legs;

    LivingBeing(int eyes, int legs) {
        this.eyes = eyes;
        this.legs = legs;
    }

    void canWalk() {
        System.out.println("This Living being  Can Walk on " + legs + "  Legs and have " + eyes + " ears" );
    }

}

class Human extends LivingBeing{
    String gender;
    Human(int eyes, int legs, String gender) {
        super(eyes, legs);
        this.gender = gender;
    }

    public void appearence() {
        System.out.println("This is a Human of " + gender + " gender and have " + eyes + " eyes and  " + legs + " legs" );
    }
}

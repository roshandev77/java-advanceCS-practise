package com.example.basicEP2;


class OOPSCLASS {
    String name;
    int age;

    public void display() {
        name = "Roshan";
        System.out.println("Ths name is " + name);
    }
}

public class AdavceCS {
    public static void main(String args[]) {
//        int index = 1;
//
//        while (index < 11) {
//            System.out.println("Index is " + index);
//            index += 1;
//        }

//        for(int idx = 1; idx < 11; idx++) {
//
//            if (idx == 5) {
//                continue;
//            }
//            System.out.println("Index using For Loop : " + idx);
//        }


//        for(int idx = 1; idx < 11; idx++) {
//
//            if (idx == 5) {
//                break;
//            }
//            System.out.println("Index using For Loop : " + idx);
//        }
//
//        do {
//            System.out.println("Print first time");
//        } while(false);

        OOPSCLASS obj = new OOPSCLASS();
        obj.display();

    }

}

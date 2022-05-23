package ploymorphism;

public class RunTimePloyMorpDemo {
    public static void main(String args[]) {
//        Parent obj = new Parent();
//        obj.display();
        Parent obj1 = new Child();
        obj1.display();

    }
}

class Parent {
    void display() {
        System.out.println("This is a parent class");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("this is a child class");
    }
}

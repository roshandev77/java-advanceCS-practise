package abstraction;

public class AbstractionDemo {
    public static void main(String args[]) {
        Shape s1 = new Circle("Blue", 2.5);
        System.out.println(s1.color);
        System.out.println(s1.area());
        Shape s2 = new Rectangle("Red", 45.5, 3.78);
        System.out.println(s2.color);
        System.out.println(s2.area());

    }
}

abstract class Shape {
    String color;
    Shape(String color) {
        this.color = color;
    }
    abstract double area();
}

class Circle extends Shape {
    double radius;
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    double area() {
        return 2 * 3.14 * radius;
    }
}

class Rectangle extends Shape {
    double l;
    double b;

    Rectangle(String color, double l, double b) {
        super(color);
        this.l = l;
        this.b = b;
    }

    @Override
    double area() {
        return (l * b);
    }
}

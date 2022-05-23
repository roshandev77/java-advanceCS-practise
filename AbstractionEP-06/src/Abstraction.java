public class Abstraction {
    public static void main(String args[]) {

//        Shape s1 = new Rectangle("Red", 4, 5);
//        System.out.println(s1.toString());

        Shape s2 = new Circle("Blue", 56.78);
        System.out.println(s2.toString());

    }
}

abstract class Shape {
    String color;

//    Concrete method
    public String getColor() {
        return color;
    }

    Shape(String color) {
        this.color = color;
    }

    abstract double area();

    abstract public String toString();
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override double area() {
        return (2 * 3.14 * radius);
    }

    @Override public String toString() {
        return "The Color is : " + super.getColor() + " and area is : " + area();
    }
}

class Rectangle extends Shape {
    int l;
    int b;

    Rectangle(String color, int l, int b) {
        super(color);
        this.l = l;
        this.b = b;
    }

    @Override double area() {
        return l * b;
    }

    @Override public String toString() {
        return "The color is : " + super.getColor() + " and the area is " + area();
    }
}

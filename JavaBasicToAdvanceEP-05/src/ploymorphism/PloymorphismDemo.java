package ploymorphism;

public class PloymorphismDemo {
    public static void main(String args[]) {
        CalculateArea cal_area = new CalculateArea();
        cal_area.area();
        System.out.println("The area of Square is " + cal_area.area(4));
        System.out.println("The area of Rectange is " + cal_area.area(2, 7));
        System.out.println("The ares of a Circle is " + cal_area.area(4.5));
    }
}

class CalculateArea {
    public void area() {
        System.out.println("Here we will not calculate area");
    }
    public int area(int s) {
        return (s * s);
    }

    public int area(int l, int b) {
        return (l * b);
    }

    public double area(double r) {
        return (2 * 3.14 * r);
    }

}

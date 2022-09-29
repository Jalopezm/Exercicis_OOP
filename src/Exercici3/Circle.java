package Exercici3;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        double perimeter = 0;
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double getArea() {
        double area = 0;
        area = Math.PI * (radius * radius);
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

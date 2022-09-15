package oo1;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius* radius * Math.PI;
    }

    @Override
    public Rectangle getFittingRectangle() {
        return new Rectangle(2 * radius, 2 * radius);
    }
}

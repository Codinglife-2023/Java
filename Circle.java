package QAP3.Q2;

// Circle.java
public class Circle extends Shape {
    private double radius;

    // No-argument constructor
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor with radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor with radius, color, and filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter and setter methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
// The Circle class extends the Shape class. It has an additional instance variable, radius, which represents the radius of the circle. The class provides multiple constructors to initialize the radius, color, and filled properties of the circle. It also includes getter and setter methods for the radius, as well as methods to calculate the area and perimeter of the circle. The toString method is overridden to provide a description of the circle's radius and its relationship to the superclass Shape.
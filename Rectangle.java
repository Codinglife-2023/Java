package QAP3.Q2;
// Rectangle.java
public class Rectangle extends Shape {
    private double width;
    private double length;

    // No-argument constructor
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor with width and length
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Constructor with width, length, color, and filled
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter and setter methods
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width + length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}
// The Rectangle class extends the Shape class. It has two additional instance variables, width and length, which represent the dimensions of the rectangle. The class provides multiple constructors to initialize the width, length, color, and filled properties of the rectangle. It also includes getter and setter methods for the width and length, as well as methods to calculate the area and perimeter of the rectangle. The toString method is overridden to provide a description of the rectangle's dimensions and its relationship to the superclass Shape.
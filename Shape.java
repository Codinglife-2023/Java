package QAP3.Q2;
// Shape.java
public class Shape {
    protected String color;
    protected boolean filled;

    // No-argument constructor
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Constructor with parameters
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter and setter methods
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }
}
// The Shape class represents a generic shape with color and filled properties. It has a no-argument constructor that sets the default color to "green" and filled to true. It also has a parameterized constructor that allows setting the color and filled properties. The class provides getter and setter methods for these properties, as well as an overridden toString method that returns a description of the shape's color and filled status.

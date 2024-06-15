package QAP3.Q3;

// Point.java
public class Point {
    private float x;
    private float y;

    // No-argument constructor
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Constructor with parameters
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter and setter methods
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
// The Point class represents a point in a two-dimensional coordinate system. It has two instance variables, x and y, which represent the coordinates of the point. The class provides a no-argument constructor that initializes the point to the origin (0, 0) and a parameterized constructor that allows setting the x and y coordinates. It also includes getter and setter methods for the x and y coordinates, as well as an overridden toString method that returns a string representation of the point's coordinates.

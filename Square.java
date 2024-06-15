package QAP3.Q2;

// Square.java
public class Square extends Rectangle {
    // Constructor with side
    public Square(double side) {
        super(side, side);
    }

    // Constructor with side, color, and filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}
// The Square class extends the Rectangle class. It has two constructors to initialize the side, color, and filled properties of the square. The class overrides the setWidth and setLength methods to ensure that the side length is always equal for a square. The toString method is overridden to provide a description of the square's side length and its relationship to the superclass Rectangle.
package QAP3.Q3;

// Demo.java
public class Demo {
    public static void main(String[] args) {
        // Create Point object and display it
        Point p1 = new Point(1.5f, 2.5f);
        System.out.println("Point: " + p1);

        // Create MovablePoint object and display it
        MovablePoint mp1 = new MovablePoint(3.0f, 4.0f, 0.5f, 1.0f);
        System.out.println("MovablePoint before move: " + mp1);

        // Move the MovablePoint and display it
        mp1.move();
        System.out.println("MovablePoint after move: " + mp1);
    }
}
// The Demo class contains a main method that creates instances of the Point and MovablePoint classes and demonstrates their functionality. It creates a Point object with coordinates (1.5, 2.5) and a MovablePoint object with coordinates (3.0, 4.0) and speeds (0.5, 1.0). It then moves the MovablePoint object by its speed and displays the updated coordinates. The output shows the initial and final positions of the MovablePoint object after moving.
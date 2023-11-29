package code26;

// Interface declaration
interface Shape {
    int circle(double rad);       // Abstract method for calculating the area of a circle
    int rectangle(int length, int breadth);  // Abstract method for calculating the area of a rectangle
}

// Class implementing the Shape interface
class Calculate implements Shape {
    // Implementation of the circle method
    public int circle(double rad) {
        return (int) (Math.PI * rad * rad);
    }

    // Implementation of the rectangle method
    public int rectangle(int length, int breadth) {
        return length * breadth;
    }
}

// Main class
public class Example {

    public static void main(String[] args) {
        // Creating an instance of the Calculate class
        Calculate c = new Calculate();

        // Calculating and printing the area of a circle
        System.out.println("Area of circle: " + c.circle(4.0));

        // Calculating and printing the area of a rectangle
        System.out.println("Area of rectangle: " + c.rectangle(4, 5));
    }
}

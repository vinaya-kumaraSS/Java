package code25;

// Interface declaration
interface Animal {
    void eat();  // Method to represent eating behavior
    void run();  // Method to represent running behavior
}

// Class implementing the Animal interface
class PrintData implements Animal {
    // Implementation of the eat method
    public void eat() {
        System.out.println("Dog is eating food");
    }

    // Implementation of the run method
    public void run() {
        System.out.println("Dog is running");
    }
}

// Main class
public class Example {
    public static void main(String[] args) {
        // Creating an instance of PrintData
        PrintData a = new PrintData();

        // Calling the eat and run methods
        a.eat();
        a.run();
    }
}

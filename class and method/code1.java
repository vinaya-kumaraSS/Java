class example {
    // Instance variables to store data
    int id;
    String name;
}

// The 'code1' class is the main class of the program
public class code1 {

    public static void main(String[] args) {
        // Creating an object of the 'example' class
        example e = new example();

        // Setting values for the 'id' and 'name' variables
        e.id = 123;
        e.name = "vinay";

        // Displaying the values of 'id' and 'name' to the console
        System.out.println("ID: " + e.id);
        System.out.println("Name: " + e.name);
    }
}

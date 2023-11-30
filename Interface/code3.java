package code27;
interface Phone {
    void cost(); 
    void size();
}

// The 'features' class implements the 'phone' interface
class Features implements Phone {
    // Implementation of the 'cost' method
    public void cost() {
        System.out.println("the cost is less");
    }

    // Implementation of the 'size' method
    public void size() {
        System.out.println("small in size");
    }

    // Additional method specific to the 'features' class
    public void features() {
        System.out.println("it consists of fewer features");
    }
}

// The 'technology' class also implements the 'phone' interface
class Technology implements Phone {
    // Implementation of the 'cost' method
    public void cost() {
        System.out.println("the cost is more");
    }

    // Implementation of the 'size' method
    public void size() {
        System.out.println("large in size");
    }

    // Additional method specific to the 'technology' class
    public void technology() {
        System.out.println("it has more advanced technology");
    }
}

// The 'example' class contains the 'main' method
public class example {
    public static void main(String[] args) {
        // Creating objects of 'features' and 'technology' classes
        Features f = new Features();
        Technology t = new Technology();

        // Displaying information about 'keypad phone'
        System.out.println("<----keypad phone---->");
        f.cost();
        f.size();
        f.features();

        // Displaying information about 'smart phone'
        System.out.println("<----smart phone---->");
        t.cost();
        t.size();
        t.technology();
    }
}
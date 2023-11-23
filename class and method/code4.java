package code3;

import java.util.Scanner;

class details {
    String name;
    int id;
    int grade[];

    public void student_name() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public void student_grade() {
        for (int a : grade) {
            System.out.println("Grade: " + a);
        }
    }
}

public class College {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating objects for the 2 students
        details std1 = new details();
        details std2 = new details();

        System.out.println("<------1st student------>");
        std1.name = sc.nextLine();
        std1.id = sc.nextInt();

        // Taking input for grades using a for loop
        System.out.println("Enter grades for the 1st student:");
        std1.grade = new int[4]; // Assuming 4 grades for simplicity
        for (int i = 0; i < std1.grade.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            std1.grade[i] = sc.nextInt();
        }

        // Calling the methods
        std1.student_name();
        std1.student_grade();

        sc.nextLine(); // Consume the newline character

        System.out.println("<------2nd student------>");
        std2.name = sc.nextLine();
        std2.id = sc.nextInt();

        // Taking input for grades using a for loop
        System.out.println("Enter grades for the 2nd student:");
        std2.grade = new int[4]; // Assuming 4 grades for simplicity
        for (int i = 0; i < std2.grade.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            std2.grade[i] = sc.nextInt();
        }

        // Calling the methods
        std2.student_name();
        std2.student_grade();

        sc.close();
    }
}

package code2;
import java.util.Scanner;
//The 'details' class represents information about a student
class details {
 // Instance variables to store student details
 String name;
 int id;

 // Method to print student details
 public void printdet() {
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
 }
}

//The 'college' class is the main class of the program
public class college {
 public static void main(String[] args) {
     // Creating objects for two students
	 Scanner sc=new Scanner(System.in);
     details std1 = new details();
     details std2 = new details();

     // Assigning values to details for the 1st student
     std1.name = sc.nextLine();
     std1.id = sc.nextInt();

     sc.nextLine();

     // Assigning values to details for the 2nd student
     std2.name = sc.nextLine();
     std2.id = sc.nextInt();

     // Calling the printdet() method to display details for the 1st student
     std1.printdet();

     // Calling the printdet() method to display details for the 2nd student
     std2.printdet();
 }
}

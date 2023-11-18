// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class average_of_marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of the students :");
        int n=sc.nextInt();
        int sum=0;
        int []marks=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("enter the student "+(i+1)+" marks :");
            marks[i]=sc.nextInt();
            sum=sum+marks[i];
        }
        System.out.println("the average marks is "+(sum/n));
    }
}
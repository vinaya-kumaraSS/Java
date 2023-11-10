import java.util.Scanner;
public class no_of_digits 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter the number :");
        int n=sc.nextInt();
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("the number of digits are :"+count);
    }
}
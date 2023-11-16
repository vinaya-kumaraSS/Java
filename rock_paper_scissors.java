import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissors
{
    public static void main(String[] args)
    {
        Random ra=new Random();
        Scanner sc=new Scanner(System.in);
        int max=4, min=1;
        int n=ra.nextInt(max-min)+min;
        System.out.println("1->Rock\n2->Paper\n3->Scissor\n");
        System.out.print("enter your choice :");
        int m=sc.nextInt();
        if(m==n)
        {
            System.out.println("the same choice ! repeat the game!!");
        }
        else if(n==1)
        {
            if(m==2)
            {
                System.out.println("you win the match");
            }
            else
            {
                System.out.println("computer win the match");
            }
        }
        else if(n==2)
        {
            if(m==1)
            {
                System.out.println("the computer win the the match");
            }
            else
            {
                System.out.println("you win the match");
            }
        }
        else
        {
            if(m==1)
            {
                System.out.println("you win the match");
            }
            else
            {
                System.out.println("computer win the match");
            }
        }
    }
}
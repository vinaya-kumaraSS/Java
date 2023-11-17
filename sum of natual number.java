import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,i=1;
        System.out.println("enter the value of n :");
        int n=sc.nextInt();
        while(i<=n)
        {
            sum=sum+i;
            i+=1;
        }
        System.out.println("sum of the digit is "+sum);
    }
}       
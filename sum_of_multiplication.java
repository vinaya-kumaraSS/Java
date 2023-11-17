import java.util.Scanner;
class sum_of_multiplication 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=8,sum=0;
        for(int i=1;i<=10;i++)
        {
            sum=sum+(n*i);
        }
        System.out.println("the sum of the multiplication is "+sum);
    }
}
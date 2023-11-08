import java.util.Scanner;
public class pattern {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row number :");
        int n=sc.nextInt();
        int num=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
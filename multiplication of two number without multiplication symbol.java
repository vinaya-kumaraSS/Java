import java.util.Scanner;
class mul {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter the two no :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<b;i++)
        {
            sum=sum+a;
        }
        System.out.println("multiplication :"+sum);
    }
}
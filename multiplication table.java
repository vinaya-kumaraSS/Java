import java.util.Scanner;
class multiplication_table {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n :");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(+n+"x"+i+"="+(n*i));
        }
    }
}
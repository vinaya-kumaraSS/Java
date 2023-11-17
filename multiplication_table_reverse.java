import java.util.Scanner;
class multiplication_table_reverse {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n :");
        int n=sc.nextInt();
        int max=10;
        while(max>=1)
        {
            System.out.println(+n+"x"+max+"="+(n*max));
            max=max-1;
        }
    }
}
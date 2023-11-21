import java.util.Scanner;
class even_or_odd {
    static void check(int a)
    {
        if(a%2==0)
        {
            System.out.println("even integer");
        }
        else
        {
            System.out.println("odd integer");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter integer :");
        int a=sc.nextInt();
        even_or_odd o=new even_or_odd();
        o.check(a);
    }
}
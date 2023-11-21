import java.util.Scanner;
class greater {
    static int check_greater(int a,int b,int c)
    {
        if(a>=b && a>=c)
        {
            return a;
        }
        else if(b>=a && b>=c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 3 number :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("largest number is "+(check_greater(a,b,c)));
    }
}
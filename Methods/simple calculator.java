import java.util.Scanner;
class simple_calculator {
    static int add(int a,int b)
    {
        return a+b;
    }
    static int sub(int a,int b)
    {
        return a-b;
    }
    static int mul(int a,int b)
    {
        return a*b;
    }
    static float div(float a,float b)
    {
        return a/b;
    }
    static int mdiv(int a,int b)
    {
        return a/b;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("1.addition\n2.substraction\n3.multiplication\n4.divion\n5.modulo division\n");
        System.out.println("enter your choice :");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Sum is :"+add(a,b));
                break;
            case 2:
                System.out.println("Sub is :"+sub(a,b));
                break;
            case 3:
                System.out.println("Mul is :"+mul(a,b));
                break;
            case 4:
                System.out.println("div is :"+div(a,b));
                break;
            case 5:
                System.out.println("modulo div is :"+mdiv(a,b));
                break;
            default:
                System.out.println("invalid choice");
                break;
        }
    }
}
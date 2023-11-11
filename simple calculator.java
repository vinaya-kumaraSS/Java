import java.util.Scanner;
class simple_calc {
    public static void main(String[] args) 
    {
        int c;
        do
        {
            Scanner sc=new Scanner(System.in);
        System.out.println("enter the two number :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("1.addition\n2.substraction\n 3.multiplication\n4.division\n5.modulo division");
        System.out.println("enter your choice :");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:System.out.println("sum :"+(a+b));
            break;
            case 2:System.out.println("sub :"+(a-b));
            break;
            case 3:
            System.out.println("mul :"+(a*b));
            break;
            case 4:
            System.out.println("division :"+(a/b));
            break;
            case 5:
            System.out.println("m-division :"+(a%b));
            break;
            default :
            System.out.println("enter the valid choice");
            break;
        }
        System.out.println("enter 1 to continue other wise 0");
         c=sc.nextInt();
        }while(c==1);
        System.exit(0);
    }
}
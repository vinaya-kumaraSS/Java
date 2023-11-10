import java.util.Scanner;
class equal {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("enter the two number :");
        int a=n.nextInt();
        int b=n.nextInt();
        if(a==b)
        {
            System.out.println("equal number");
        }
        else
        {
            System.out.println("not equal number");
        }
    }
}
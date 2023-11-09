import java.util.Scanner;
class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three number :");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int p=sc.nextInt();
        if (m>n && m>p)
        {
            System.out.println(m);
        }
        else if(n>p)
        {
            System.out.println(n);
        }
        else
        {
            System.out.println(p);
        }
    }
}
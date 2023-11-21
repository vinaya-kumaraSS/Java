import java.util.Scanner;
class HelloWorld {
    static void react_area(int b,int h)
    {
        System.out.println("area of rectangle is "+(b*h));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Breadth :");
        int b=sc.nextInt();
        System.out.print("Height :");
        int h=sc.nextInt();
        react_area(b,h);
    }
}
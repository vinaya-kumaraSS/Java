import java.util.Scanner;
class sgpa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the subject 1 marks :");
        int a=sc.nextInt();
        System.out.print("enter the subject 2 marks :");
        int b=sc.nextInt();
        System.out.print("enter the subject 3 marks :");
        int c=sc.nextInt();
        int sgpa=(a+b+c)/3;
        System.out.println("the sgpa of the given marks is "+sgpa);
    }
}
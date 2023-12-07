package Exceptions_Handling;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        arr[0]=34;
        arr[1]=40;
        arr[2]=33;
        System.out.println("enter index :");
        int ind=sc.nextInt();
        System.out.println("enter number to divide");
        int num=sc.nextInt();
        try {
            System.out.println("the element is :"+arr[ind]);
            System.out.println("result :"+(arr[ind]/num));
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch ( Exception e)
        {
            System.out.println(e);
        }
    }

}

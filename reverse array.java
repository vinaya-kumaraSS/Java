import java.util.Scanner;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array :");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements :");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("array before reverse :");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
            System.out.print("\t");
        }
        System.out.println();
        int j=n-1,i=0;
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println("array after reverse :");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]);
            System.out.print("\t");
        }
    }
}
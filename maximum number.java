import java.util.Scanner;
class max_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the numbers :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int a:arr)
        {
            if(a>max)
            {
                max=a;
            }
        }
        System.out.print("maximum number is "+max);
    }
}
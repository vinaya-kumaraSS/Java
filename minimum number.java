import java.util.Scanner;
class min_num {
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
        int min=arr[0];
        for(int a:arr)
        {
            if(a<min)
            {
                min=a;
            }
        }
        System.out.print("minimum number is "+min);
    }
}
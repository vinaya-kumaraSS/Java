import java.util.Scanner;
class sum_even_odd {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int even_sum=0,odd_sum=0;
        System.out.println("enter the number of elements :");
        int o=sc.nextInt();
        for(int i=0;i<o;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                even_sum=even_sum+a[i];
            }
            else
            {
                odd_sum=odd_sum+a[i];
            }
        }
        System.out.println("even sum is :"+even_sum);
        System.out.println("odd sum is :"+odd_sum);
    }
}
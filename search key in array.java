import java.util.Scanner;
class find_num {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num[]={10,20,45,67,34,23};
        System.out.print("enter the key to search :");
        int key=sc.nextInt();
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==key)
            {
                System.out.println("key is found, position :"+(i+1));
                System.exit(0);
            }
        }
        System.out.println("key is not found");
    }
}
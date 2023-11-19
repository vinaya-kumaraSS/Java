import java.util.Scanner;

class max_and_min_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0], min = arr[0];
        for (int a : arr) {
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }
        System.out.println("Minimum number is " + min);
        System.out.println("Maximum number is " + max);
    }
}

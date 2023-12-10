package finally_keybord;

public class example1 {
    public static int divide(int a, int b)
    {
        try
        {
          int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("code Executed");
        }
        return 0;
    }
    public static void main(String[] args) {
        int d=divide(8,4);
        System.out.println(d);
    }
}

package finally_keybord;

public class example {
    public static void main(String[] args) {
        try {
            int a=6,b=0;
            System.out.println(a/b);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("code executed");
        }
    }
}

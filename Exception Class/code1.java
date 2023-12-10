package Exception;
import java.util.Scanner;

class MyException extends Exception
{
    @Override
    public String toString() {
        return "this is tostring()";
    }

    @Override
    public String getMessage() {
        return "this is get_message()";
    }
}
public class Exception_class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<99)
        {
            try {
                throw new MyException();
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}

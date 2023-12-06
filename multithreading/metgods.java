package multithreading;
class Mthread1 extends Thread
{
    public void run()
    {
       for (int i=0;i<5;i++)
       {
           System.out.println("Vinay");
       }
    }
}
class Mthread2 extends Thread
{
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("kumar");
        }
    }
}
public class methods {
    public static void main(String[] args) {
        Mthread1 m1=new Mthread1();
        Mthread2 m2=new Mthread2();
        m1.start();
        try {
            m1.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        m2.start();
    }
}

package multithreading;
class MyThread1 extends Thread
{
    public void run()
    {
        while (true)
        {
            System.out.println("vinay");
            try {
                sleep(100);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyThread2 extends Thread
{
    public void run()
    {
        int i=0;
        while (i<=50)
        {
            System.out.println("kumar");
            i++;
        }
    }
}
public class sleep_method {
    public static void main(String[] args) {
        MyThread1 m1=new MyThread1();
        MyThread2 m2=new MyThread2();
        m1.start();
        m2.start();
    }
}

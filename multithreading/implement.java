package multithreading;
class thread1 implements Runnable
{
   public void run()
   {
       System.out.println("Thread 1");
   }
}
class thread2 implements Runnable
{
    public void run()
    {
        System.out.println("Thread 2");
    }
}
public class implement {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        Thread g1 = new Thread(t1);

        thread2 t2 = new thread2();
        Thread g2 = new Thread(t2);
        g2.start();
        g1.start();
    }
}

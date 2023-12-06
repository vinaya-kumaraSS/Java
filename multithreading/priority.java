package multithreading;
class Mythread extends Thread
{
    private String name;
    public  Mythread(String name)
    {
        this.name=name;
    }
    public void run()
    {
        System.out.println("tha name is :"+name);
    }
}
public class priority {
    public static void main(String[] args) {
        Mythread m1=new Mythread("vinay");
        Mythread m2=new Mythread("darshan");
        Mythread m3=new Mythread("deepak");
        Mythread m4=new Mythread("santhu");
        Mythread m5=new Mythread("chandan");


        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.MIN_PRIORITY);
        m3.setPriority(Thread.MIN_PRIORITY);
        m4.setPriority(Thread.MIN_PRIORITY);
        m5.setPriority(Thread.MIN_PRIORITY);

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();

    }
}

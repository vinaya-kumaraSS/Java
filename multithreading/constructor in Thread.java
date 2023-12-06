package multithreading;
class mythr extends Thread
{
    public mythr(String name)
    {
        System.out.println("hi "+name);
    }
    public void run()
    {
        System.out.println("hello karnataka");
    }
}
public class constructor_in_thread {
    public static void main(String[] args) {
        mythr t1=new mythr("vinay");
        t1.start();

        mythr t2=new mythr("pooja");
        t2.start();

        System.out.println("the name is "+t1.getName());
        System.out.println("the name is "+t2.getName());
        System.out.println("the id is :"+t1.threadId());
        System.out.println("the id is :"+t2.threadId());
    }
}

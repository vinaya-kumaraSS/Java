package multithreading;

class mythread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 40)
        {
            System.out.println("Task 1");
            i++;
        }
    }
}
class mythread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("Task 2");
            i++;
        }
    }
}

public class example1 {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();
        t1.start();
        t2.start();
    }
}

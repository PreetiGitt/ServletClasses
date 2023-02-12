package daemonThread;

class B implements Runnable{
    @Override
    public void run() {

        System.out.println("radhey: "+Thread.currentThread().getName());
    }
}
public class Main1 {
    public static void main(String[] args) {

        B b1=new B();
        Thread t1=new Thread(b1);
        t1.start();
        System.out.println(t1.isDaemon());
        System.out.println("Main :"+Thread.currentThread().getName());


    }



}

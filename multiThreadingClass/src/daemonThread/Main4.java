package daemonThread;

class D implements Runnable{

    @Override
    public void run() {
for(int i=0;i<100;i++) {

    System.out.println( Thread.currentThread().getName()+" :  "+i);
}
    }
}
class E implements Runnable{

    @Override
    public void run() {
        D a1=new D();
        Thread t1=new Thread(a1,"Daemon Child");

        t1.start();

       for(int i=0;i<200;i++) {

            System.out.println( Thread.currentThread().getName()+" :  "+i);
        }
        }
    }
public class Main4 {
    public static void main(String[] args) {

        E a1=new E();
        Thread t1=new Thread(a1,"Daemon");
        t1.setDaemon(true);
        t1.start();


        for(int i=0;i<10;i++) {

            System.out.println("Main: " + Thread.currentThread().getName()+": "+i);
        }

    }



}

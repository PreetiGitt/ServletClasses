package daemonThread;

class F implements Runnable{

    @Override
    public void run() {
for(int i=0;i<200;i++) {

    System.out.println( Thread.currentThread().getName()+" :  "+i);
}
    }
}
class G implements Runnable{

    @Override
    public void run() {
        F a1=new F();
        Thread t1=new Thread(a1,"Daemon Child");
t1.setDaemon(false); //Explicitly making non-Daemon
        t1.start();

       for(int i=0;i<200;i++) {

            System.out.println( Thread.currentThread().getName()+" :  "+i);
        }
        }
    }
public class Main5 {
    public static void main(String[] args) {

        G a1=new G();
        Thread t1=new Thread(a1,"Daemon");
        t1.setDaemon(true);
        t1.start();


        for(int i=0;i<10;i++) {

            System.out.println("Main: " + Thread.currentThread().getName()+": "+i);
        }

    }



}

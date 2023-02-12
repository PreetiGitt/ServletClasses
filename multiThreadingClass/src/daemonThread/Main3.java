package daemonThread;

class C implements Runnable{

    @Override
    public void run() {
for(int i=0;i<100;i++) {

    System.out.println("radhey: " + Thread.currentThread().getName()+" :  ");
}
    }
}
public class Main3 {
    public static void main(String[] args) {

        A a1=new A();
        Thread t1=new Thread(a1);

        t1.start();
        t1.setDaemon(true);

        for(int i=0;i<10;i++) {

            System.out.println("Main: " + Thread.currentThread().getName());
        }

    }



}

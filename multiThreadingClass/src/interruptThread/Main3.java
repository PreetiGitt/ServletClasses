package interruptThread;

class C implements Runnable{

    @Override
    public void run() {
while (!Thread.currentThread().isInterrupted()){
    System.out.println("all is well");
}
    }
}
public class Main3 {
    public static void main(String[] args) throws InterruptedException {

        C a1=new C();
        Thread t1 =new Thread(a1);

        t1.start();
        Thread.sleep(4000);
        t1.interrupt();











    }
}

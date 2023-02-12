package interruptThread;

class D implements Runnable{

    @Override
    public void run() {
while (!Thread.interrupted()){
    System.out.println("all is fine");
}
    }
}
public class Main4 {
    public static void main(String[] args) throws InterruptedException {

        D d1=new D();
        Thread t1 =new Thread(d1);

        t1.start();
        Thread.sleep(4000);
        t1.interrupt();











    }
}

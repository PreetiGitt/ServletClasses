package interruptThread;

class B implements Runnable{

    @Override
    public void run() {
while (true){
    System.out.println("neww");
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    }
}
public class Main2 {
    public static void main(String[] args) throws InterruptedException {

        B a1=new B();
        Thread t1 =new Thread(a1);

        t1.start();
        Thread.sleep(2000);
        t1.interrupt();











    }
}

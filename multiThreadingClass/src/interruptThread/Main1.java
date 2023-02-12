package interruptThread;
 /*in cases except wait(), join()-> interrupted status is true
 but need to be checked by Thread itself*/
class A implements Runnable{

    @Override
    public void run() {
while (true){
    System.out.println("Heyy");
}
    }
}
public class Main1 {
    public static void main(String[] args) throws InterruptedException {

        A a1=new A();
        Thread t1 =new Thread(a1);

        t1.start();
        Thread.sleep(1000);
        t1.interrupt();











    }
}

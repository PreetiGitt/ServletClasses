package join;
class C implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=50;i++)
            System.out.println("Rukmini Ji "+Thread.currentThread().getName()+" "+i);
    }
}
public class Main3 {
    public static void main(String[] args) throws InterruptedException {

    C a1= new C();
        Thread t1=new Thread(a1,"Mathura");
       // Thread t2= new Thread(a1);
        t1.start();

       t1.join(50000);
        for(int i=1;i<=100;i++){
            System.out.println("Vaasudev Krishna "+Thread.currentThread().getName() +":" +i);
        }
        System.out.println("Last Line");
    }
}

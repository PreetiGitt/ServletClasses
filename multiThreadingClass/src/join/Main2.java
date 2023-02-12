package join;

class B implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=500;i++)
        System.out.println("Rukmini "+Thread.currentThread().getName()+" "+i);
    }
}
public class Main2 {
    public static void main(String[] args) throws InterruptedException {

    B a1= new B();
        Thread t1=new Thread(a1,"Mathura");
       // Thread t2= new Thread(a1);
        t1.start();

       t1.join(70);// main joins t1
        for(int i=1;i<=100;i++){
            System.out.println("Vasudev "+Thread.currentThread().getName() +":" +i);
        }
        System.out.println("Last Line");
    }
}

package join;

class A implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=100;i++)
        System.out.println("Radha "+Thread.currentThread().getName()+" "+i);
    }
}
public class Main1 {
    public static void main(String[] args) throws InterruptedException {

    A a1= new A();
        Thread t1=new Thread(a1,"Vrindavan");
       // Thread t2= new Thread(a1);
        t1.start();

       t1.join();// main joins t1
        for(int i=1;i<=100;i++){
            System.out.println("Krishna "+Thread.currentThread().getName() +":" +i);
        }
        System.out.println("Final Line");
    }
}

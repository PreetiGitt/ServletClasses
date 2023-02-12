package two;
// multiple thread doing the different thing
class D implements Runnable
{
    public void run()
    {
        for(int k=1;k<=50;k++)
            System.out.println("Rukmini "+k+" "+Thread.currentThread().getName());
    }
}

public class Main2 {
    public static void main(String[] args) {

        C c1 = new C();
        D d1 = new D();
        Thread t1 = new Thread(c1, "Krishna");
        Thread t2 = new Thread(d1, "Radha");
        t1.start();
        t2.start();
    }
}

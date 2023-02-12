package two;
// multiple thread doing the same thing
class C implements Runnable
{
    public void run()
    {
        for(int k=1;k<=50;k++)
            System.out.println("Rukmini "+k+" "+Thread.currentThread().getName());
    }
}

public class Main1 {
    public static void main(String[] args) {

        C c1 = new C();

        Thread t1 = new Thread(c1, "Krishna");
        Thread t2 = new Thread(c1, "Radha");
        t1.start();
        t2.start();
    }
}

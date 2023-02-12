package one;

class C implements Runnable
{
    public void run()
    {
        for(int k=1;k<=50;k++)
            System.out.println("Rukmini "+k+" "+Thread.currentThread().getName());
    }
}

public class Main4 {
    public static void main(String[] args) {

        C c1 =new C();

        Thread t1=new Thread(c1,"Krishna");
        t1.start();
        for(int k=1;k<=20;k++)
            System.out.println("Radha "+k+" "+Thread.currentThread().getName());
    }
}

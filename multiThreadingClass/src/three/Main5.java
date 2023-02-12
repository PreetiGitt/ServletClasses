package three;

//Exception in one thread
class Task3 implements Runnable{

    @Override
    public void run() {
        for(int k=0;k<5000;k++){
            System.out.println(k+":"+Thread.currentThread().getName());
        }
    }
}

class Task4 implements Runnable{

    @Override
    public void run()
    {
        try {
            Thread.sleep(50);
            System.exit(1);// exits the whole process
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
public class Main5 {
    public static void main(String[] args) {

        Task3 task1 = new Task3();
        Task4 task2 = new Task4();
        Thread t1 = new Thread(task1, "Krishna");
        t1.start();

        Thread t2 = new Thread(task2, "Radha");

        t2.start();
    }
}

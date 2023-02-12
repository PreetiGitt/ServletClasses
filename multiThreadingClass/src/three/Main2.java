package three;

import java.util.Scanner;
//Exception in one thread
class Task1 implements Runnable{

    @Override
    public void run() {
        for(int k=0;k<5000;k++){
            System.out.println(k+":"+Thread.currentThread().getName());
        }
    }
}

class Task2 implements Runnable{

    @Override
    public void run() //throws ArrayIndexOutOfBoundsException -unchecked exception valid in method signature
    {
        try {
            Thread.sleep(10);
            System.out.println("Exception"+10/0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
public class Main2 {
    public static void main(String[] args) {

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Thread t1 = new Thread(task1, "Krishna");
        t1.start();

        Thread t2 = new Thread(task2, "Radha");

        t2.start();
    }
}

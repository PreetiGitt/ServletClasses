package two;

import java.util.Scanner;

class Task1 implements Runnable{
Scanner sc=new Scanner(System.in);
String input=null;
    @Override
    public void run() {
        System.out.println("Enter something");
        input= String.valueOf(sc.next());
        System.out.println("You Entered: "+input);
    }
}

class Task2 implements Runnable{

    @Override
    public void run() {
for(int k=0;k<10;k++){
    System.out.println(k);
}
    }
}
public class Main3 {
    public static void main(String[] args) {

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Thread t1 = new Thread(task1, "Krishna");
        Thread t2 = new Thread(task2, "Radha");
        t1.start();
        t2.start();
    }
}

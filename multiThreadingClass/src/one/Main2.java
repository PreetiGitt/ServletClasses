package one;

class A extends Thread{
    @Override
    public void run() {
        System.out.println("Krishna");
    }
}
public class Main2 {
    public static void main(String[] args) {

        A a1=new A();
        a1.start();
    }



}

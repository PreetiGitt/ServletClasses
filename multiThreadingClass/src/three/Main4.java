package three;
//scenario... in catch block, do something on interruption of thread
public class Main4 {
    public static void main(String[] args)  {
        try {
            Thread.sleep(1000);// interrupted before time-> throws InterruptedException

            System.out.println("radhey");
        }
        catch (InterruptedException e){
            //do something on interruption of thread
        }
    }
}

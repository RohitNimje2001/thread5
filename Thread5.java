
class MultithreadingDemo extends Thread {
    public void run()
    {
        try {
          
            System.out.println(
                "Hello All");
        }
        catch (Exception e) {
            
            System.out.println("Exception is caught");
        }
    }
}
 
// Main Class
public class Multithread {
    public static void main(String[] args)
    {
        int n = 5; 
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object
                = new MultithreadingDemo();
            object.start();
        }
    }
}


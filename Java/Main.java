import java.io.InterruptedIOException;

public class Main {
    public static void main(String[] args)  throws InterruptedIOException{
        
        // To calculate execution time

        long start = System.nanoTime();

        // --------- program--------------


            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        // -------------------------------

        long duration = ( System.nanoTime() - start)/1000000;

        System.out.println(duration + "ms");
    }
}
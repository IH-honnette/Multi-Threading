package multithreading;

import java.io.IOException;

public class ThreadDemo {

    public static void main(String[] args) throws IOException {
        //create thread;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<5; i++) {
                    System.out.println("Hello Thread  " + System.currentTimeMillis());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }

        ).start();
        System.out.println("Completed");
    }
}

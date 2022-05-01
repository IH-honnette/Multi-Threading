package multithreading;

public class ExtendThreadDemo extends Thread{
    String threadName;
    public ExtendThreadDemo(String threadName) {
        this.threadName =threadName;
    }

    public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread " + i + " Name= "+threadName);
        }
    }
    public static void main(String[] args) {
        ExtendThreadDemo thread1 =new ExtendThreadDemo("Thread 1");
        ExtendThreadDemo thread2 =new ExtendThreadDemo("thread2");
        //thread2.setPriority(Thread.MAX_PRIORITY);
        thread2.start();
        thread1.start();
    }
}

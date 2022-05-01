package multithreading;

public class RunnableDemo implements Runnable{
    Thread thread;
    String threadName;
    public RunnableDemo(String threadName) {
        this.threadName =threadName;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + i + " Name= "+threadName);
        }
    }
    public void execute (){
        thread =new Thread(this);
        thread.start();
    }

}

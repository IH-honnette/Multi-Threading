package multithreading;

public class TestThread {
    public static void main(String[] args) {
        RunnableDemo thread1 =new RunnableDemo("Thread 1");
        RunnableDemo thread2 =new RunnableDemo("thread2");
        thread2.execute();
        thread1.execute();

    }
}

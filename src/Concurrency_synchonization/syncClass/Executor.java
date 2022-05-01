package Concurrency_synchonization.syncClass;

import Concurrency_synchonization.syncClass.Task;

public class Executor extends Thread{
    private Task task;
    private String name;
    private Thread thread;
    private int number;
    public Executor(String name,int number, Task task) {
        this.name =name;
        this.number =number;
        this.task =task;
    }
    @Override
    public void run() {
        System.out.println(name + "started");
        synchronized (task){
            task.perform(number);
        }
        System.out.println(name+ "completed");// not synchronized so it can come randomly.
    }

    public void start() {
        if(thread == null) thread =new Thread(this);
        thread.start();
    }


}

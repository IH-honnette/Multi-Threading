package Concurrency_synchonization.syncMethos;

import Concurrency_synchonization.syncMethos.TaskMethodSynchronized;

public class TaskMethodExecutor extends Thread{

    private String name;
    private int number;
    private TaskMethodSynchronized task;
    public TaskMethodExecutor(String name, int number,TaskMethodSynchronized task) {

        this.name =name;
        this.task =task;
        this.number =number;
    }

    @Override
    public void run() {
        System.out.println(name + "started");
        task.perform(number);
        System.out.println(name +" completed");
    }
}

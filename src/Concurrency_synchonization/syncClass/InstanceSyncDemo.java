package Concurrency_synchonization.syncClass;

import Concurrency_synchonization.syncMethos.TaskMethodExecutor;
import Concurrency_synchonization.syncMethos.TaskMethodExecutor2;
import Concurrency_synchonization.syncMethos.TaskMethodSynchronized;

public class InstanceSyncDemo {

    public static void main(String[] args) {
        //Synchronized at runtime
        Task task =new Task();
        Executor exc1 =new Executor("Task1",5,task);
        Executor exc2 =new Executor("task2",2,task);
        exc1.start();
        exc2.start();
        System.out.println("All completed");


    }

}

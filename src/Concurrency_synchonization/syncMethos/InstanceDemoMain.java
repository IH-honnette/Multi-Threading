package Concurrency_synchonization.syncMethos;

public class InstanceDemoMain {
    //start method if it is outside a method (main or any other ) then it's a compilation error.
    public static void main(String[] args) {
        //syncronized at compile time even in codes they are shared already.

        TaskMethodSynchronized table =new TaskMethodSynchronized();
        //TaskMethodSynchronized table2 =new TaskMethodSynchronized();
        TaskMethodExecutor firstMultiplicationThread =new TaskMethodExecutor("First",10,table);
        TaskMethodExecutor2 secondMultiplicationThread =new TaskMethodExecutor2("Second",2,table);

        firstMultiplicationThread.start();
        secondMultiplicationThread.start();
    }
}

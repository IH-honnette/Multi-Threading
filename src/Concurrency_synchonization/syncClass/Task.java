package Concurrency_synchonization.syncClass;

/*
* The whole class is synchronized in this case. We lock it in Executor class
* Synchronized with threads of same types of type Task !!!!!!! very important to note
* */
public class Task {
    void perform(int number) {
        try {
            for (int i=1; i<10; i++) {
                System.out.println(i + "*"+ number +"=" + i*number);
                Thread.sleep(100);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package Concurrency_synchonization.syncMethos;

public class TaskMethodSynchronized {

   synchronized void perform(int number) {
       /*
       * This method iss locked for threads with different types meaning with all with their new Task
       * !! very important to note
       * */
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

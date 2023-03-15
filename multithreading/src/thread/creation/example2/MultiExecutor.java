package thread.creation.example2;

import java.util.ArrayList;
import java.util.List;

public class MultiExecutor {

    // Add any necessary member variables here
    private List<Thread> threads = new ArrayList<>();

    /*
     * @param tasks to executed concurrently
     */
    public MultiExecutor(List<Runnable> tasks) {
        // Complete your code here
        for (Runnable runnable : tasks) {
            threads.add(new Thread(runnable));
        }
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        // complete your code here
        for (Thread thread : threads) {
            thread.start();
        }
    }
}
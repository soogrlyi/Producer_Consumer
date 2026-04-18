import java.util.concurrent.ArrayBlockingQueue;

public class CheckoutQueue {

    private ArrayBlockingQueue<Integer> queue;


    public CheckoutQueue(int capacity) {
        queue = new ArrayBlockingQueue<>(capacity);
    }


    public void enterQueue(int customerId) {
        try {
            queue.put(customerId); // waits if full
            System.out.println("Customer " + customerId + " entered the queue.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public int serveCustomer() {
        int id = -1;
        try {
            id = queue.take(); // waits if empty
            System.out.println("Customer " + id + " is being served.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return id;
    }
}
public class Customer implements Runnable {
    private int id;
    private CheckoutQueue queue;

    public Customer(int id, CheckoutQueue queue) {
        this.id = id;
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            // Simulate shopping time
            Thread.sleep((int)(Math.random() * 2000));

            System.out.println("Customer " + id + " finished shopping and is entering queue.");

            queue.enterQueue(id);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Cashier implements Runnable {
    private int id;
    private CheckoutQueue queue;

    public Cashier(int id, CheckoutQueue queue) {
        this.id = id;
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int customerId = queue.serveCustomer();

                System.out.println("Cashier " + id + " is serving Customer " + customerId);

                // Simulate checkout time
                Thread.sleep((int)(Math.random() * 1500));
            }
        } catch (InterruptedException e) {
            System.out.println("Cashier " + id + " stopped.");
        }
    }
}
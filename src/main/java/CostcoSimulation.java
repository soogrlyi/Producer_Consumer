import java.util.Scanner;

public class CostcoSimulation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int numCustomers = input.nextInt();

        System.out.print("Enter number of cashiers: ");
        int numCashiers = input.nextInt();

        System.out.print("Enter queue size: ");
        int queueSize = input.nextInt();

        CheckoutQueue queue = new CheckoutQueue(queueSize);

        // add threads here
        // Start cashier threads first
        for (int i = 1; i <= numCashiers; i++) {
            Thread cashierThread = new Thread(new Cashier(i, queue));
            cashierThread.start();
        }

        // Start customer threads
        for (int i = 1; i <= numCustomers; i++) {
            Thread customerThread = new Thread(new Customer(i, queue));
            customerThread.start();
        }

        System.out.println("Simulation started.");
    }
}
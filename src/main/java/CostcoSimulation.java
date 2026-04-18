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

        // partner will add threads here later
    }
}
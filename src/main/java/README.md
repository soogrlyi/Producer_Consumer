# Costco Checkout Simulation

## Angie Portillo

* I created the `CheckoutQueue` class using `ArrayBlockingQueue`
* implemented:

    * `enterQueue()` = adds customers (waits if full)
    * `serveCustomer()` = removes customers (waits if empty)
* Started the main class with user input (customers, cashiers, queue size)

## Notes

* The queue is thread-safe, so no `synchronized` is needed

## Aman Qais

* Implemented the `Customer` class (producer threads)
  * Simulates shopping time using `Thread.sleep()`
  * Adds customers to the queue using `enterQueue()`

* Implemented the `Cashier` class (consumer threads)
  * Retrieves customers using `serveCustomer()`
  * Simulates checkout processing time

* Completed thread logic in `CostcoSimulation`
  * Created and started customer and cashier threads
  * Connected all components using the shared queue



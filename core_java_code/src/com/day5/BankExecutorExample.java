package com.day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Task for each customer
class BankTransaction implements Runnable {
    private String customerName;
    private String transactionType;
    private int amount;

    public BankTransaction(String customerName, String transactionType, int amount) {
        this.customerName = customerName;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " → Processing " + transactionType + 
                " of ₹" + amount + " for " + customerName);
        try {
            Thread.sleep(1000); // Simulate transaction time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +
                " → Transaction completed for " + customerName);
    }
}

public class BankExecutorExample {
    public static void main(String[] args) {
        // Create a thread pool of 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit multiple bank transactions
        executor.execute(new BankTransaction("Akash", "Deposit", 5000));
        executor.execute(new BankTransaction("Anitha", "Withdraw", 3000));
        executor.execute(new BankTransaction("Srinivas", "Deposit", 2000));
        executor.execute(new BankTransaction("Lavanya", "Withdraw", 4000));
        executor.execute(new BankTransaction("Pranali", "Deposit", 10000));

        // Shutdown the executor after tasks are submitted
        executor.shutdown();
    }
}

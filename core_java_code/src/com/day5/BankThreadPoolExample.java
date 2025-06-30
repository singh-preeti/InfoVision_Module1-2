package com.day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BankTask implements Runnable {
    private String customerName;
    private String transactionType;
    private int amount;

    public BankTask(String customerName, String transactionType, int amount) {
        this.customerName = customerName;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + 
            " → Processing " + transactionType + 
            " of ₹" + amount + 
            " for " + customerName);
        try {
            Thread.sleep(1000); // Simulate processing delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + 
            " → Transaction Complete for " + customerName);
    }
}

public class BankThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService bankExecutor = Executors.newFixedThreadPool(4);

        // Simulate incoming client requests
        bankExecutor.execute(new BankTask("Kirutika", "Deposit", 5000));
        bankExecutor.execute(new BankTask("Akash", "Withdraw", 2000));
        bankExecutor.execute(new BankTask("Anitha", "Deposit", 3000));
        bankExecutor.execute(new BankTask("Jaya", "Withdraw", 4000));
        bankExecutor.execute(new BankTask("Pawana", "Deposit", 7000));

        // Shut down executor after task submission
        bankExecutor.shutdown();
    }
}

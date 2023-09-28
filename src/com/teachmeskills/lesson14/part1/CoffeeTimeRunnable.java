package com.teachmeskills.lesson14.part1;

public class CoffeeTimeRunnable implements Runnable {
    private final String name;
    private final int priority;

    public CoffeeTimeRunnable(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        Thread.currentThread().setPriority(priority);


        System.out.println(Thread.currentThread().getName() + " Drinking coffee.");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("-");
                Thread.sleep(500);
            }
            System.out.println();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

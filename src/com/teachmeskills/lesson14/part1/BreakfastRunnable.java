package com.teachmeskills.lesson14.part1;

public class BreakfastRunnable implements Runnable {
    private final String name;
    private final int priority;

    public BreakfastRunnable(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        Thread.currentThread().setPriority(priority);


        System.out.println(Thread.currentThread().getName() + " I started having breakfast.");
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
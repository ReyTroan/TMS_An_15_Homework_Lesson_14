package com.teachmeskills.lesson14.part1;

public class Runner {

    public static void main(String[] args) throws InterruptedException{
        Thread coffeeTime = new Thread(new CoffeeTimeRunnable("thread 3", Thread.MIN_PRIORITY));
        Thread newspaperTime = new Thread(new NewspaperRunnable("thread 2", Thread.MIN_PRIORITY));
        Thread breakfastTime = new Thread(new BreakfastRunnable("thread 1", Thread.MAX_PRIORITY));

        breakfastTime.start();

        newspaperTime.start();
        newspaperTime.join();
        System.out.println("Finished reading the news");

        coffeeTime.start();
        coffeeTime.join();
        System.out.println("Finished drinking coffee");

        breakfastTime.join();
        System.out.println("Finished breakfast");

    }
}

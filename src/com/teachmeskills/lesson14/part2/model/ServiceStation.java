package com.teachmeskills.lesson14.part2.model;

public class ServiceStation {
    private static final int MAX_CAPACITY = 10;
    private int count = 0;

    // method of adding machines to the service station
    public synchronized void addCar() throws InterruptedException {
        while (count >= MAX_CAPACITY) {
            wait();
        }
        count++;
        System.out.println("Added a car");
        notify();
    }

    // a method for servicing machines on the service
    public synchronized void repairCar() throws InterruptedException {
        while (count == 0) {
            wait();
        }
        count--;
        System.out.println("The car is serviced. Current number of cars at the station: " + count);
        notify();
    }
}
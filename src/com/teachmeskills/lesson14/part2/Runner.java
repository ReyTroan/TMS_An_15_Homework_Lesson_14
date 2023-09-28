package com.teachmeskills.lesson14.part2;
import com.teachmeskills.lesson14.part2.model.ServiceStation;
import com.teachmeskills.lesson14.part2.threads.Producer;
import com.teachmeskills.lesson14.part2.threads.Consumer;

public class Runner {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();

        Thread producerThread = new Thread(new Producer(serviceStation));
        Thread consumerThread = new Thread(new Consumer(serviceStation));

        producerThread.start();
        consumerThread.start();
    }
}

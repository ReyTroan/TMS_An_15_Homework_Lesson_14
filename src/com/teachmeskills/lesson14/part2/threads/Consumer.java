package com.teachmeskills.lesson14.part2.threads;

import com.teachmeskills.lesson14.part2.model.ServiceStation;
public class Consumer implements Runnable {
    private final ServiceStation serviceStation;

    public Consumer(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    @Override
    public void run() {
        while (true) {
            try {
                serviceStation.repairCar();
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
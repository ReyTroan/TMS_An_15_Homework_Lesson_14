package com.teachmeskills.lesson14.part2.threads;

import com.teachmeskills.lesson14.part2.model.ServiceStation;

public class Producer implements Runnable {
    private final ServiceStation serviceStation;

    public Producer(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    @Override
    public void run() {
        while (true) {
            try {
                serviceStation.addCar();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.ingenuous.cci;

import java.util.ArrayList;
import java.util.List;

public class ThreadingExample {

    public static void main(String args[]){
        List<Integer> sharedList = new ArrayList<Integer>();

        Thread producerThread = new Thread(new Producer(sharedList));
        Thread consumerThread = new Thread(new Consumer(sharedList));

       // try {
            producerThread.start();
            consumerThread.start();
            //producerThread.join();
            //consumerThread.join();
       // } catch (InterruptedException ie){
       //     ie.printStackTrace();
       // }


    }
}


class Producer implements Runnable{

    List<Integer> sharedList = null;
    final int MAX_SIZE=10;
    int i = 0;

    public Producer(List<Integer> sharedList){
        super();
        this.sharedList = sharedList;
    }

    @Override
    public void run() {
        while(i <= 50){
            try {
                produce(i++);
                System.out.println("Produced a new item: " + i + ". List size = " + sharedList.size());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void produce(int i) throws InterruptedException{
        synchronized (sharedList) {
            while (sharedList.size() == MAX_SIZE) {
                System.out.println("Producer waiting as the List has reached MAX_SIZE = " + MAX_SIZE);
                sharedList.wait();
            }
        }
        synchronized (sharedList){
            sharedList.add(i);
            Thread.sleep(10);
            sharedList.notify();
        }
    }
}


class Consumer implements Runnable{

    List<Integer> sharedList = null;
    int i;

    public Consumer(List<Integer> sharedList){
        super();
        this.sharedList = sharedList;
    }

    @Override
    public void run() {
        while(true){
            try {
                consume();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Consumed: " + i);
        }

    }

    public void consume() throws InterruptedException{

        synchronized (sharedList){
            while(sharedList.size() == 0){
                System.out.println("Waiting for the producer to produce more...");
                sharedList.wait();
            }
        }

        synchronized (sharedList){
            i = sharedList.remove(0);
            sharedList.notify();
        }
        Thread.sleep(1000);

    }
}
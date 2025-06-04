package com.adobe.threading;

public class RoundRobinPrinter {
    private static final int MAX = 100;
    private int number = 1;
    private int turn = 1; // 1 for t1, 2 for t2, 3 for t3

    public static void main(String[] args) {
        RoundRobinPrinter printer = new RoundRobinPrinter();
        Thread t1 = new Thread(() -> printer.printNumbers(1));
        Thread t2 = new Thread(() -> printer.printNumbers(2));
        Thread t3 = new Thread(() -> printer.printNumbers(3));

        t1.start();
        t2.start();
        t3.start();
    }

    private synchronized void printNumbers(int threadId) {
        while (number <= MAX) {
            while (turn != threadId) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            // Check again in case number exceeded MAX while waiting
            if (number > MAX) {
                notifyAll();
                break;
            }

            System.out.println("Thread " + threadId + " prints: " + number++);

            // Update turn to next thread
            turn = (turn % 3) + 1;
            notifyAll();
        }
    }
}

package org.example;

public class AnonymousMain {
    public static void main(String[] args) {
        Thread anonTh1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++)
                    System.out.println("Thread started - " + i);
            }
        });
        anonTh1.start();
        Thread anonTh2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++)
                    System.out.println("Thread started - " + i);
            }
        });
        anonTh2.start();
    }
}

package org.example;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread started - " + i);
    }
}

public class MainRunnable {
    public static void main(String[] args) {
        Thread firstMR = new Thread(new MyRunnable());
        Thread secondMR = new Thread(new MyRunnable());
        firstMR.start();
        secondMR.start();
    }

}

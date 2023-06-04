package org.example;

class MyThread extends Thread { // Создание потока через класс Thread
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread started - " + i);
    }
}

public class MainThread {
    public static void main(String[] args) {
        MyThread firstMT = new MyThread();
        MyThread secondMT = new MyThread();
        firstMT.start();
        secondMT.start();
    }
}
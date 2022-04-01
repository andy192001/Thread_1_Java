package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BreakThread breakThread = new BreakThread();
        new MainThread(1, 2, breakThread).start();
        new MainThread(2, 3, breakThread).start();
        new MainThread(3, 4, breakThread).start();
        new Thread(breakThread).start();
    }
}

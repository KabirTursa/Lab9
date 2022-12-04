package org.example;

public class RunnableClass implements Runnable {
    String str;

    public RunnableClass(String s) {
        str = s;
    }

    public void run() {
        System.out.println("The string is: " + str);
        System.out.println("( ͡° ͜ʖ ͡°)\n¯\\_(ツ)_/¯");
    }
}

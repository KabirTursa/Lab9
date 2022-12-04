package org.example;

public class Main {
    public static void main(String[] args) {
        Student Tim = new Student("Tim", 2.8);
        Student Alex = new Student("Alex", 3.9);
        Student Jerry = new Student("Jerry", 2.6);
        Student Meghan = new Student("Meghan", 3.867);
        Student Johanna = new Student("Johanna", 3.11);
        Student Jonathan = new Student("Jonathan", 1.78);
        Student MacKenzie = new Student("MacKenzie", 4.0);
        Student Cornelious = new Student("Cornelious", 1.4);
        Student Christopher = new Student("Christopher", 4.0);
        Student Michelangelo = new Student("Michelangelo", 3.74);

        System.out.println(Tim.compareTo(Christopher));
        System.out.println(MacKenzie.compareTo(Cornelious));

        Thread t1 = new Thread(new RunnableClass("abc"));
        Thread t2 = new Thread(new RunnableClass("def"));
        t1.start();
        t2.start();
    }
}
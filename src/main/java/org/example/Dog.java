package org.example;

public class Dog extends Animal implements Pet{

    String voice;

    public Dog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Dog "+getName()+" say: Woof");
    }

    void greets(Dog another){
        System.out.println("Dog "+another.getName()+" say: Woof");
    }

    @Override
    public void feed() {
        System.out.println("Feeding dog "+getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking dog "+getName());
    }

    @Override
    public void play() {
        System.out.println("Playing dog "+getName());
    }
}

package org.example;

public abstract class Animal {

    private final String name;
    abstract void greets();

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }
}



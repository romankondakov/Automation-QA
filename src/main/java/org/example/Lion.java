package org.example;

public class Lion extends Animal implements WildAnimal{
    public Lion(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Lion "+getName()+" says: Roar");
    }

    @Override
    public void hunting() {
        System.out.println("Lions "+getName()+ "goes hunting");
    }
}

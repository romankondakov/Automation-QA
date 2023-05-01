package org.example;

public class DataOutput {

    public static void main(String[] args) {

        Animal animal = new Animal(true, "meat", 4);
        animal.PrintInfo();
        System.out.println("----------------");
        Cat cat = new Cat(true, "milk", 4, "white");
        cat.PrintInfoCat();
        System.out.println("----------------");
        Cat cat1 = new Cat("Black");
        cat1.PrintInfoCat();
    }
}

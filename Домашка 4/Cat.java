package org.example;

public class Cat extends Animal {

    String color;

    public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    public Cat(String color) {
        super (true, "fish", 4);
        this.color = color;
    }


    public String getColor() {
        return color;
    }


    public  void  PrintInfoCat() {
        super.PrintInfo();
        System.out.println("What color is it? - " + getColor());
    }

}


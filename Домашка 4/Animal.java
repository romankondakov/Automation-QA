package org.example;

public class Animal  {

    public  boolean vegetarian;
    public  String eats;
    public  int noOfLegs;

    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }


    public Animal() {
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String  getEats() {
        return  eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }


    public void PrintInfo() {
        System.out.println("Is the animal vegetarian? - " + isVegetarian() + "\nWhat does she eat? - " +
                getEats() +"\nHow much legs does she have? - " + getNoOfLegs() );
    }
}

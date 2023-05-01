package org.example;

public abstract class Employee {

   final String name;


    protected Employee(String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public String getLastName() {
        return "";
    }

    abstract String getPosition ();

    abstract String getSeniority ();

    public String getInfo() {
        return "";
    }

}




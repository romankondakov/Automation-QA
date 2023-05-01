package org.example;

public class AngularDeveloper extends Employee {


    protected AngularDeveloper(String name) {
        super(name);
    }

    @Override
    String getPosition() {
        return "Middle";
    }

    @Override
    String getSeniority() {
        return "Angular Developer";
    }

    @Override
    public String getInfo() {
        return super.getInfo()+ " " +name+ " " + " Is a " + getSeniority()+ " " +getPosition();
    }
}

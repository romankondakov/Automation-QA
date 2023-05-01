package org.example;

public class JavaDeveloper extends Employee{

    protected JavaDeveloper(String name) {
        super(name);
    }

    @Override
    String getPosition() {
        return "Senior";
    }

    @Override
    String getSeniority() {
        return "Java Developer";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " +name+ " " + " Is a " + getSeniority()+ " " +getPosition();
    }
}

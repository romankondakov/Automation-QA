package org.example;

public class ManualTestEngineer extends Employee{
    final String lastName;

    public ManualTestEngineer(String name,String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    String getPosition() {
        return "Manual Test Engineer";
    }

    @Override
    String getSeniority() {
        return "Junior";
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+ " " +name+ " " +lastName+ " Is a " + getSeniority()+ " " +getPosition();
    }
}

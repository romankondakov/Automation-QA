package org.example;

public class AutomationEngineer extends Employee {
    final String lastName;

    public AutomationEngineer(String name ,String lastName) {
        super(name);
        this.lastName = lastName;
    }


    @Override
    String getPosition() {
        return "Automation Engineer";
    }

    @Override
    String getSeniority() {
        return "Senior";
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+ " "+lastName+ " Is a " + getSeniority()+ " " +getPosition();
    }
}

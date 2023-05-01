package org.example;

import java.util.Arrays;

public class Manager extends Employee {

    final String lastName;
    Employee[] team = new Employee[4];

    public Manager(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    String getPosition() {
        return "Senior";
    }

    @Override
    String getSeniority() {
        return "Manager";
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + name + " " + lastName + " Is a " + getSeniority() + " " + getPosition() +
                " and has a team of 4 members: " + Arrays.toString(getTeamNames());
    }


    public void setTeamMembers(Employee employee1, Employee employee2, Employee employee3, Employee employee4) {
        team[0] = employee1;
        team[1] = employee2;
        team[2] = employee3;
        team[3] = employee4;
    }

    public String[] getTeamNames() {
        String[] names = new String[4];
        for (int i = 0; i < team.length; i++) {
            names[i] = team[i].getName();
        }
        return names;
    }
}




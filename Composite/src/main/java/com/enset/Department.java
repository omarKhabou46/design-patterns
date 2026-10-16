package com.enset;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationComponent {
    private String name;
    private List<OrganizationComponent> componentList = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }


    public void addComponent(OrganizationComponent component) {
        componentList.add(component);
    }



    @Override
    public void showDetails() {
        System.out.println("Department: " + name);
        for (OrganizationComponent component : componentList) {
            component.showDetails();
        }
    }


}

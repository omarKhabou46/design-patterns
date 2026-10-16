package com.enset;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Department department = new Department("IT");
        Employee employee = new Employee("omar", "SI");
        department.addComponent(employee);
        Department department2 = new Department("Finance");
        department2.addComponent(department);

        department.showDetails();

        System.out.println("================================");

        department2.showDetails();
    }
}

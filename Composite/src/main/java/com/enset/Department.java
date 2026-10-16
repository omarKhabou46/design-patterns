package com.enset;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Department> departmentList = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }


    public void addDepartment(Department department) {
        departmentList.add(department);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}

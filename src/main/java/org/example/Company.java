package org.example;

import java.util.List;

public class Company {

    private final List<Employee> employeeList;

    public Company(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void printAllEmployeesSalary(List<Employee> employees) {
        double collectiveSalary = 0;
        for (Employee employee : employees) {
            collectiveSalary += employee.getSalary();
        }
        System.out.println("All employees' salary is " + collectiveSalary);
    }

    public void getEmployeesData(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}

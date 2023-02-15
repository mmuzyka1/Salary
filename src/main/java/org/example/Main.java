package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {

    static int employeesNumber = 5;

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Company company = new Company(employees);
        DataCollector collector = new DataCollector();

        System.out.println("Please, enter the data of " + employeesNumber + " employees.");
        for (int i = 0; i < employeesNumber; i++) {
            company.addEmployee(collector.getEmployeeData());
        }

        printMenu();
        int number = collector.getMenuOption();
        while (number != 4) {
            switch (number) {
                case 1 -> company.printAllEmployeesSalary(employees);
                case 2 -> company.getEmployeesData(employees);
                case 3 -> {
                    collector.getScanner().nextLine();
                    company.addEmployee(collector.getEmployeeData());
                }
            }
            printMenu();
            number = collector.getMenuOption();
        }
    }

    public static void printMenu() {
        System.out.println("Please, choose one of the options: ");
        System.out.println("1 - Print sum of all employees salary");
        System.out.println("2 - Display all employees data");
        System.out.println("3 - Add new employee");
        System.out.println("4 - end program");
    }
}
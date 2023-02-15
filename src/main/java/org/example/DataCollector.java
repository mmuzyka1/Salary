package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataCollector {

    Scanner scanner = new Scanner(System.in);

    public Employee getEmployeeData() {
        String firstName = getFirstName();
        String lastName = getLastName();
        double salary = getSalary();
        scanner.nextLine();
        return new Employee(firstName, lastName, salary);
    }

    public String getFirstName() {
        System.out.println("Please, enter the name of the employee:");
        String input = scanner.nextLine();
        while (input.isEmpty()) {
            System.out.println("Name cannot be empty.");
            input = scanner.nextLine();
        }
        return input;
    }

    public String getLastName() {
        System.out.println("Please, enter the last name of the employee:");
        String input = scanner.nextLine();
        while (input.isEmpty()) {
            System.out.println("Last name cannot be empty.");
            input = scanner.nextLine();
        }
        return input;
    }

    public double getSalary() {
        System.out.println("Please, enter the salary of the employee:");
        double salary = 0;
        while (salary == 0) {
            try {
                salary = scanner.nextDouble();
                while (salary <= 0) {
                    System.out.println("Salary should be greater than 0.");
                    salary = scanner.nextDouble();
                }
            } catch (InputMismatchException e) {
                System.out.println("This is not a valid format. Salary should be a number.");
                scanner.nextLine();
            }
        }
        return salary;
    }

    public int getMenuOption() {
        return scanner.nextInt();
    }
}


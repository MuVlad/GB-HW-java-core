package ru.gb.jcore.hw_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static void printEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static void main(String[] args) {
        Employee employee = new Employee("Boris", 54, 2000l, JobTitle.WORKER, "+7(999)339-79-65");
        Employee employee1 = new Employee("Elena", 43, 3500l, JobTitle.WORKER, "+7(990)339-79-33");
        Employee employee2 = new Employee("Stas", 32,  500l, JobTitle.WORKER, "+7(922)339-79-54");
        Employee employee3 = new Employee("Olga", 35,  4200l, JobTitle.WORKER, "+7(900)339-79-32");
        Employee supervisor = new Supervisor("Vlad", 26, 5100l, "+7(911)330-33-33");
        Employee supervisor1 = new Supervisor("Valya", 26, 4900l, "+7(911)330-33-32");

        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(supervisor);
        employees.add(supervisor1);
        printEmployees(employees);
        System.out.println("------------------------------------------");

        Supervisor.upSalaryAllEmployees(employees, 1000);
        printEmployees(employees);
        System.out.println("------------------------------------------");

        employees.sort(new EmployeeComparator());
        printEmployees(employees);
    }
}

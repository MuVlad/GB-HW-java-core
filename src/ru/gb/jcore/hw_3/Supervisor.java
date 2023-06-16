package ru.gb.jcore.hw_3;

import java.util.List;

public class Supervisor extends Employee{
    public Supervisor() {
    }

    public Supervisor(String name, int age, Long salary, String phoneNumber) {
        super(name, age, salary, JobTitle.SUPERVISOR, phoneNumber);
    }

    public static void upSalaryEmployee(Employee employee, int increase) {
        if (employee.getJobTitle() == JobTitle.WORKER) {
            employee.setSalary(employee.getSalary() + increase);
        }
    }

    public static void upSalaryAllEmployees(List<Employee> employees, int increase) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getJobTitle() == JobTitle.WORKER) {
                employees.get(i).setSalary(employees.get(i).getSalary() + increase);
            }
        }
    }
}

package ru.gb.jcore.hw_3;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int result = emp2.getAge() - emp1.getAge();
        if (result == 0) {
           return (int) (emp2.getSalary() - emp1.getSalary());
        }
        return result;
    }
}

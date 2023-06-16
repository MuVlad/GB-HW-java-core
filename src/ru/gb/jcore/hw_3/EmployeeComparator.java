package ru.gb.jcore.hw_3;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int result = (int) (emp2.getSalary() - emp1.getSalary());
        if (result == 0) {
           return emp2.getAge() - emp1.getAge();
        }
        return result;
    }
}

package ru.gb.jcore.hw_3;

public class Employee {

    private String name;
    private int age;
    private Long salary;
    private JobTitle jobTitle;
    private String phoneNumber;

    public Employee() {
    }

    public Employee(String name, int age, Long salary, JobTitle jobTitle, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", jobTitle=" + jobTitle +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

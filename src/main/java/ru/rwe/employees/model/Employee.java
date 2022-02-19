package ru.rwe.employees.model;

public class Employee {

    private String department;
    private Integer number;
    private String name;
    private Integer age;
    private Salary salary;

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", " + salary +
                '}';
    }
}



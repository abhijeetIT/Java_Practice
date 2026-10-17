package main.java.JavaBasic.StreamApi_Java8.Streams.Collector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private double salary;
    private String designation;
    private String department;

    public Employee(String name, int age, double salary, String designation, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + name + '\'' +
                ", Age=" + age +
                ", Salary=" + salary +
                ", Designation='" + designation + '\'' +
                ", Department='" + department + '\'' +
                '}';
    }
    
}

public class SecondHighestSalary {
    
    public static void main(String[] args) {
         List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Abhijeet", 25, 50000, "Software Engineer", "IT"));
        employees.add(new Employee("Priya", 30, 65000, "Project Manager", "Operations"));
        employees.add(new Employee("Rahul", 28, 55000, "Data Analyst", "Analytics"));
        employees.add(new Employee("Sneha", 35, 80000, "HR Manager", "Human Resources"));

        employees.stream().map(Employee::)
    }
}

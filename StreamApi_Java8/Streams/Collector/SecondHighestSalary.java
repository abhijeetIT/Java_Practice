package main.java.JavaBasic.StreamApi_Java8.Streams.Collector;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import src.main.java.JavaBasic.seeTypeOFvariable;

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

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}


public class SecondHighestSalary {
    
    public static void main(String[] args) {
         List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Abhijeet", 25, 50000, "Software Engineer", "IT"));
        employees.add(new Employee("Priya", 30, 65000, "Project Manager", "Operations"));
        employees.add(new Employee("Rahul", 28, 55000, "Data Analyst", "Analytics"));
        employees.add(new Employee("Sneha", 35, 80000, "HR Manager", "Human Resources"));

        Optional<Double> secondHighestSalary = employees.stream().map(Employee::getSalary)
                          .distinct()
                          .sorted(Comparator.reverseOrder())
                          .skip(1)
                          .findFirst();

        System.out.println(secondHighestSalary);
    }
    
}
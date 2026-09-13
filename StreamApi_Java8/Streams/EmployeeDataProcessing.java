package src.main.java.JavaBasic.StreamApi_Java8.Streams;

import java.util.Arrays;
import java.util.List;

public class EmployeeDataProcessing {

      static class Employee{
        String name;
        int Age;
        Double Salary;
        String Department;

         public Employee(String name, int age, Double salary, String department) {
             this.name = name;
             Age = age;
             Salary = salary;
             Department = department;
         }

         public void setAge(int age) { Age = age; }

         public void setSalary(Double salary) { Salary = salary; }

         public void setDepartment(String department) { Department = department; }

         public void setName(String name) { this.name = name; }

         public String getName() { return name; }

         public int getAge() { return Age;}

         public Double getSalary() { return Salary;}

         public String getDepartment() { return Department; }
     }

     //this function print the all output
     public static void Print(String Categorie,List<Employee> Employees){
            System.out.println("=======The Employees in "+Categorie+"======");
              for(Employee emp : Employees){
                 System.out.println("Employee Name: "+emp.name);
                 System.out.println("Employee Age: "+emp.Age);
                 System.out.println("Employee Salary: "+emp.Salary);
                 System.out.println("=============================================");
        }
     }

    public static void main(String[] args) {
        List<Employee> Employees = Arrays.asList(
                new Employee("Abhijeet Jha",20,19000D,"IT"),
                new Employee("Amarjeet",18,20000D,"Finance"),
                new Employee("Himanshu",15, 1500.00,"Group D"),
                new Employee("Gautam Jha",21,40000.00,"Data Analysis"),
                new Employee("Suraj singh",21,20000.00,"HR"),
                new Employee("Sobuj Biswas",20,10900D,"IT"),
                new Employee("Sneha saha",20,200000D,"HR"),
                new Employee("Priyanshu Jha",16,14000D,"Group D")
        );

        // Find
        // 1. All employees in IT department
        // 2. Average salary of employees
        // 3. Employees with salary > 55000
        // 4. Names of employees sorted alphabetically

        //1.
        List<Employee> EmployeesInIT = Employees.stream().filter(x -> x.Department.contains("IT")).toList();
        Print("IT",EmployeesInIT); //Display data
        

        //2.
        Double avgSalary = Employees.stream()
                                    .mapToDouble(Employee::getSalary)
                                    .average()
                                    .orElse(0.0);
        
        System.out.println("The avarage Salary of Employees is : "+avgSalary);

        //3.
        List<Employee> sortBySalary = Employees.stream().filter(x -> x.getSalary() > 55000).toList();
        Print("Salary > 55,000", sortBySalary);

        //4.
        List<String> sortedName = Employees.stream()
                                             .map(Employee::getName)
                                             .sorted()
                                             .toList();
        
         System.out.println("Sorted name of employees: "+sortedName);
        
    }
}

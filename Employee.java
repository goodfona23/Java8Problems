package com;

class Employee {
    private String name;
    private String department;
    private Double salary;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    
    public Employee(String name, String department,double salary) {
        this.name = name;
        this.department = department;
        this.salary=salary;
        
    }


    public String getDepartment() {
        return department;
    }
    
    public Double getSalary() {
        return salary;
    }
}

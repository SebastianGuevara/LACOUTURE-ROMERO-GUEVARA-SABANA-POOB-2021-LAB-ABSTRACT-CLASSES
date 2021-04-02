package edu.sabana.poob.sabanapayroll;

import java.util.UUID;

public abstract class Employee
{
    public UUID id;
    public String name;
    public String lastName;
    public Department department;
    
    public Employee(String name, String lastName, Department department)
    {
        this.name=name;
        this.lastName=lastName;
        this.id=UUID.randomUUID();
        this.department=department;
    }
    @Override
    public abstract String toString();

    public UUID getId()
    {
        return this.id;
    }
    public abstract double calculateSalary();

}

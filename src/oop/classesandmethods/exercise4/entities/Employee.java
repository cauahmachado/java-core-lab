package oop.classesandmethods.exercise4.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double calculateNetSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary += (grossSalary *(percentage/100));
    }
}

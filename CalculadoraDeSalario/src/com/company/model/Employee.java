package com.company.model;

public class Employee {

    private long cpf;
    private String name;
    private String email;
    private double baseSalary;
    private String office;

    public Employee(long cpf, String name, String email, double baseSalary, String office){
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.baseSalary = baseSalary;
        this.office = office;
    }

    public String getName(){
        return name;
    }
}

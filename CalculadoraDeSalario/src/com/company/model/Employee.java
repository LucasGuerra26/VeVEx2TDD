package com.company.model;

public class Employee {

    private long cpf;
    private String name;
    private String email;
    private double baseSalary;
    private double realSalary;
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

    public String getOffice(){
        return office;
    }

    public String getEmail(){
        return email;
    }

    public long getCpf(){
        return cpf;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public double getRealSalary(){
        return realSalary;
    }

    public void setOffice(String office){
        this.office = office;
    }

    public void calculateRealSalary(){
        if (office.equals("DESENVOLVEDOR")){
            if (baseSalary>=3000){
                realSalary = baseSalary - 0.2*baseSalary;
            } else {
                realSalary = baseSalary - 0.1*baseSalary;
            }
        }
        else if (office.equals("DBA") || office.equals("TESTADOR")){
            if (baseSalary>=2000){
                realSalary = baseSalary - 0.25*baseSalary;
            } else {
                realSalary = baseSalary - 0.15*baseSalary;
            }
        }
        else {
            if (baseSalary>=5000){
                realSalary = baseSalary - 0.3*baseSalary;
            } else {
                realSalary = baseSalary - 0.2*baseSalary;
            }
        }
    }
}

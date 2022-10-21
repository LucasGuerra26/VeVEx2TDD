package com.company.service;

import com.company.model.Employee;

public class CreateEmployeeServiceImpl implements CreateEmployeeService{
    public Employee createEmployee(long cpf, String name, String email, double baseSalary, String office){
        Employee newEmployee = new Employee(cpf, name, email, baseSalary, office);
        return newEmployee;
    }
}

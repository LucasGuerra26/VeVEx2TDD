package com.company.controller;

import com.company.model.Employee;
import com.company.service.CreateEmployeeService;
import com.company.service.CreateEmployeeServiceImpl;

import java.util.ArrayList;

public class EmployeeController {
    private CreateEmployeeService createEmployeeService;
    private ArrayList<Employee> employees;

    public EmployeeController(){
        createEmployeeService = new CreateEmployeeServiceImpl();
        employees = new ArrayList<>();
    }

    public Employee createEmployee(long cpf, String name, String email, double baseSalary, String office){
        Employee e = createEmployeeService.createEmployee(cpf, name, email, baseSalary, office);
        employees.add(e);
        return e;
    }


}

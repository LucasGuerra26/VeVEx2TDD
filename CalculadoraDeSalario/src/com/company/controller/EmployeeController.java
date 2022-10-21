package com.company.controller;

import com.company.model.Employee;
import com.company.service.CreateEmployeeService;
import com.company.service.CreateEmployeeServiceImpl;
import com.company.service.UpdateOfficeService;
import com.company.service.UpdateOfficeServiceImpl;

import java.util.ArrayList;

public class EmployeeController {
    private CreateEmployeeService createEmployeeService;
    private UpdateOfficeService updateOfficeService;
    private ArrayList<Employee> employees;

    public EmployeeController(){
        createEmployeeService = new CreateEmployeeServiceImpl();
        updateOfficeService = new UpdateOfficeServiceImpl();
        employees = new ArrayList<>();
    }

    public Employee createEmployee(long cpf, String name, String email, double baseSalary, String office){
        Employee e = createEmployeeService.createEmployee(cpf, name, email, baseSalary, office);
        employees.add(e);
        return e;
    }

    public void updateOffice(Employee employee, String office){
        updateOfficeService.updateOffice(employee, office);
    }

}

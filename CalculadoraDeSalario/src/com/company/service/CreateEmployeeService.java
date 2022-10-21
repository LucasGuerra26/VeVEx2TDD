package com.company.service;

import com.company.model.Employee;

public interface CreateEmployeeService {
    Employee createEmployee(long cpf, String name, String email, double baseSalary, String office);
}

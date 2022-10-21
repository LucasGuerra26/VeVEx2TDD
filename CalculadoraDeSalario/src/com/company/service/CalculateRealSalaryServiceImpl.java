package com.company.service;

import com.company.model.Employee;

public class CalculateRealSalaryServiceImpl implements CalculateRealSalaryService{

    @Override
    public void calculate(Employee employee) {
        employee.calculateRealSalary();
    }
}

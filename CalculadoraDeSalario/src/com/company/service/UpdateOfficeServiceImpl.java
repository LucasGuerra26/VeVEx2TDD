package com.company.service;

import com.company.model.Employee;

public class UpdateOfficeServiceImpl implements UpdateOfficeService{
    @Override
    public void updateOffice(Employee employee, String newOffice) {
        employee.setOffice(newOffice);
    }
}

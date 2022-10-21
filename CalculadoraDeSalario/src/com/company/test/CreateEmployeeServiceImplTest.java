package com.company.test;

import com.company.model.Employee;
import com.company.service.CreateEmployeeService;
import com.company.service.CreateEmployeeServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateEmployeeServiceImplTest {
    @Test
    void createEmployeeTest(){
        CreateEmployeeService createService = new CreateEmployeeServiceImpl();

        Employee e = createService.createEmployee(123456789, "Adeildo", "ad@g.com", 3000, "DESENVOLVEDOR");
        assertEquals("Adeildo", e.getName());
        assertEquals("ad@g.com", e.getEmail());
        assertEquals("DESENVOLVEDOR", e.getOffice());
    }
}
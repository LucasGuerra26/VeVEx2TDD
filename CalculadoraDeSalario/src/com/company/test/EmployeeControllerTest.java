package com.company.test;

import com.company.controller.EmployeeController;
import com.company.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeControllerTest {
    private EmployeeController employeeController;

    @BeforeEach
    void testSetUp(){
        employeeController = new EmployeeController();
    }

    @Test
    void createEmployeeTest(){
        Employee e = employeeController.createEmployee(123456789, "Adeildo", "ad@g.com", 3000, "DESENVOLVEDOR");
        assertEquals("Adeildo", e.getName());
        assertEquals("ad@g.com", e.getEmail());
        assertEquals("DESENVOLVEDOR", e.getOffice());
    }

    @Test
    void updateOfficeTest(){
        Employee e = employeeController.createEmployee(123456789, "Adeildo", "ad@g.com", 3000, "DESENVOLVEDOR");
        assertEquals("DESENVOLVEDOR", e.getOffice());
        employeeController.updateOffice(e, "GERENTE");
        assertEquals("GERENTE", e.getOffice());
    }
}
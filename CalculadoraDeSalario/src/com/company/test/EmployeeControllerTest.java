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

    @Test
    void calculateDeveloperSalaryTest(){
        Employee e = new Employee(123456789, "Adeildo", "ad@g.com", 3000, "DESENVOLVEDOR");
        Employee e2 = new Employee(123456788, "Lucas", "Lu@g.com", 2500, "DESENVOLVEDOR");
        employeeController.calculateRealSalary(e);
        employeeController.calculateRealSalary(e2);
        assertEquals(2400, e.getRealSalary());
        assertEquals(2250, e2.getRealSalary());
    }

    @Test
    void calculateDBASalaryTest(){
        Employee e = new Employee(123456789, "Adeildo", "ad@g.com", 3000, "DBA");
        Employee e2 = new Employee(123456788, "Lucas", "Lu@g.com", 1500, "DBA");
        employeeController.calculateRealSalary(e);
        employeeController.calculateRealSalary(e2);
        assertEquals(2250, e.getRealSalary());
        assertEquals(1275, e2.getRealSalary());
    }

    @Test
    void calculateSalaryTesterTest(){
        Employee e = new Employee(123456789, "Adeildo", "ad@g.com", 3000, "TESTADOR");
        Employee e2 = new Employee(123456788, "Lucas", "Lu@g.com", 1500, "TESTADOR");
        employeeController.calculateRealSalary(e);
        employeeController.calculateRealSalary(e2);
        assertEquals(2250, e.getRealSalary());
        assertEquals(1275, e2.getRealSalary());
    }
    @Test
    void calculateManagerSalaryTest(){
        Employee e = new Employee(123456789, "Adeildo", "ad@g.com", 6000, "GERENTE");
        Employee e2 = new Employee(123456788, "Lucas", "Lu@g.com", 4500, "GERENTE");
        employeeController.calculateRealSalary(e);
        employeeController.calculateRealSalary(e2);
        assertEquals(4200, e.getRealSalary());
        assertEquals(3600, e2.getRealSalary());
    }
}
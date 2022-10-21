package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void createEmployeeTest(){
        Employee e = new Employee(123456789, "Adeildo", "ad@g.com", 3000, "DESENVOLVEDOR");
        assertEquals("Adeildo", e.getName());
    }

    @Test
    void getTest(){
        Employee e = new Employee(123456789, "Adeildo", "ad@g.com", 3000, "DESENVOLVEDOR");
        assertEquals("Adeildo", e.getName());
        assertEquals(123456789, e.getCpf());
        assertEquals("ad@g.com", e.getEmail());
        assertEquals(3000, e.getBaseSalary());
        assertEquals("DESENVOLVEDOR", e.getOffice());

    }

    @Test
    void calculateDeveloperSalaryTest(){
        Employee e = new Employee(123456789, "Adeildo", "ad@g.com", 3000, "DESENVOLVEDOR");
        Employee e2 = new Employee(123456788, "Lucas", "Lu@g.com", 2500, "DESENVOLVEDOR");
        e.calculateRealSalary();
        e2.calculateRealSalary();
        assertEquals(2400, e.getRealSalary());
        assertEquals(2250, e2.getRealSalary());
    }

    @Test
    void calculateDBASalaryTest(){
        Employee e = new Employee(123456789, "Adeildo", "ad@g.com", 3000, "DBA");
        Employee e2 = new Employee(123456788, "Lucas", "Lu@g.com", 1500, "DBA");
        e.calculateRealSalary();
        e2.calculateRealSalary();
        assertEquals(2250, e.getRealSalary());
        assertEquals(1275, e2.getRealSalary());
    }

    @Test
    void calculateSalaryTesterTest(){
        Employee e = new Employee(123456789, "Adeildo", "ad@g.com", 3000, "TESTADOR");
        Employee e2 = new Employee(123456788, "Lucas", "Lu@g.com", 1500, "TESTADOR");
        e.calculateRealSalary();
        e2.calculateRealSalary();
        assertEquals(2250, e.getRealSalary());
        assertEquals(1275, e2.getRealSalary());
    }
    @Test
    void calculateManagerSalaryTest(){
        Employee e = new Employee(123456789, "Adeildo", "ad@g.com", 6000, "GERENTE");
        Employee e2 = new Employee(123456788, "Lucas", "Lu@g.com", 4500, "GERENTE");
        e.calculateRealSalary();
        e2.calculateRealSalary();
        assertEquals(4200, e.getRealSalary());
        assertEquals(3600, e2.getRealSalary());
    }
}
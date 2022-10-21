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
}
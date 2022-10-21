package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void createEmployee(){
        Employee e = new Employee("123456789", "Adeildo", "ad@g.com", 3000, "DESENVOLVEDOR");
        assertEquals("Adeildo", e.getName());
    }
}
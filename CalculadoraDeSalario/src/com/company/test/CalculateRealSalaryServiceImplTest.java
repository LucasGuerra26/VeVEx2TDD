package com.company.test;

import com.company.model.Employee;
import com.company.service.CalculateRealSalaryService;
import com.company.service.CalculateRealSalaryServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateRealSalaryServiceImplTest {

    @Test
    void calculateDeveloperSalaryTest(){
        CalculateRealSalaryService calculateRealSalaryService = new CalculateRealSalaryServiceImpl();
        Employee e = new Employee(123456789, "Adeildo", "ad@g.com", 3000, "DESENVOLVEDOR");
        Employee e2 = new Employee(123456788, "Lucas", "Lu@g.com", 2500, "DESENVOLVEDOR");
        calculateRealSalaryService.calculate(e);
        calculateRealSalaryService.calculate(e2);
        assertEquals(2400, e.getRealSalary());
        assertEquals(2250, e2.getRealSalary());
    }

    @Test
    void calculateDBASalaryTest(){
        CalculateRealSalaryService calculateRealSalaryService = new CalculateRealSalaryServiceImpl();
        Employee e = new Employee(123456789, "Adeildo", "ad@g.com", 3000, "DBA");
        Employee e2 = new Employee(123456788, "Lucas", "Lu@g.com", 1500, "DBA");
        calculateRealSalaryService.calculate(e);
        calculateRealSalaryService.calculate(e2);
        assertEquals(2250, e.getRealSalary());
        assertEquals(1275, e2.getRealSalary());
    }

    @Test
    void calculateSalaryTesterTest(){
        CalculateRealSalaryService calculateRealSalaryService = new CalculateRealSalaryServiceImpl();
        Employee e = new Employee(123456789, "Adeildo", "ad@g.com", 3000, "TESTADOR");
        Employee e2 = new Employee(123456788, "Lucas", "Lu@g.com", 1500, "TESTADOR");
        calculateRealSalaryService.calculate(e);
        calculateRealSalaryService.calculate(e2);
        assertEquals(2250, e.getRealSalary());
        assertEquals(1275, e2.getRealSalary());
    }
    @Test
    void calculateManagerSalaryTest(){
        CalculateRealSalaryService calculateRealSalaryService = new CalculateRealSalaryServiceImpl();
        Employee e = new Employee(123456789, "Adeildo", "ad@g.com", 6000, "GERENTE");
        Employee e2 = new Employee(123456788, "Lucas", "Lu@g.com", 4500, "GERENTE");
        calculateRealSalaryService.calculate(e);
        calculateRealSalaryService.calculate(e2);
        assertEquals(4200, e.getRealSalary());
        assertEquals(3600, e2.getRealSalary());
    }
}
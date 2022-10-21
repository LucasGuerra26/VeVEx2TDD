package com.company.test;

import com.company.model.Employee;
import com.company.service.UpdateOfficeService;
import com.company.service.UpdateOfficeServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpdateOfficeServiceImplTest {
    @Test
    void UpdateOfficeTest(){
        Employee e = new Employee(123456789, "Adeildo", "ad@g.com", 3000, "DESENVOLVEDOR");
        UpdateOfficeService updateOfficeService = new UpdateOfficeServiceImpl();
        assertEquals("DESENVOLVEDOR", e.getOffice());
        updateOfficeService.updateOffice(e, "GERENTE");
        assertEquals("GERENTE", e.getOffice());
    }
}
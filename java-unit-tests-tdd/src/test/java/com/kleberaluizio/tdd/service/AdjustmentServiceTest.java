package com.kleberaluizio.tdd.service;

import com.kleberaluizio.tdd.model.Employee;
import com.kleberaluizio.tdd.model.Performance;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AdjustmentServiceTest {

    @Test
    void adjustmentShouldBe3PercentWhenPerformanceNotGood(){
        AdjustmentService service = new AdjustmentService();
        Employee employee = new Employee("Chandler", LocalDate.now(), new BigDecimal("1000.0"));

        service.grantAdjustment(employee, Performance.NOT_GOOD);

        assertEquals(new BigDecimal("1030.00"), employee.getSalary());
    }

    @Test
    void adjustmentShouldBe15PercentWhenPerformanceGood(){
        AdjustmentService service = new AdjustmentService();
        Employee employee = new Employee("Chandler", LocalDate.now(), new BigDecimal("1000.0"));

        service.grantAdjustment(employee, Performance.GOOD);

        assertEquals(new BigDecimal("1150.00"), employee.getSalary());
    }

    @Test
    void adjustmentShouldBe20PercentWhenPerformanceGreat(){
        AdjustmentService service = new AdjustmentService();
        Employee employee = new Employee("Chandler", LocalDate.now(), new BigDecimal("1000.0"));

        service.grantAdjustment(employee, Performance.GREAT);

        assertEquals(new BigDecimal("1200.00"), employee.getSalary());
    }

}
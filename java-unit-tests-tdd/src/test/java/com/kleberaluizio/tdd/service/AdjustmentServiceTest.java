package com.kleberaluizio.tdd.service;

import com.kleberaluizio.tdd.model.Employee;
import com.kleberaluizio.tdd.model.Performance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AdjustmentServiceTest {

    private AdjustmentService service;
    private Employee employee;

    @BeforeEach
    public void start(){
        this.service =  new AdjustmentService();
        this.employee = new Employee("Chandler", LocalDate.now(), new BigDecimal("1000.0"));
    }

    @Test
    void adjustmentShouldBe3PercentWhenPerformanceNotGood(){
        service.grantAdjustment(employee, Performance.NOT_GOOD);
        assertEquals(new BigDecimal("1030.00"), employee.getSalary());
    }

    @Test
    void adjustmentShouldBe15PercentWhenPerformanceGood(){
        service.grantAdjustment(employee, Performance.GOOD);
        assertEquals(new BigDecimal("1150.00"), employee.getSalary());
    }

    @Test
    void adjustmentShouldBe20PercentWhenPerformanceGreat(){
        service.grantAdjustment(employee, Performance.GREAT);
        assertEquals(new BigDecimal("1200.00"), employee.getSalary());
    }

}
package com.kleberaluizio.tdd.service;

import com.kleberaluizio.tdd.model.Employee;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void bonusShouldBe10PercentOfSalary(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calculateBonus(
                new Employee("Joe", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250.0"),bonus);
    }
    @Test
    void bonusShouldBe10PercentOfSalaryIfSalaryEquals1000(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calculateBonus(
                new Employee("Joe", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.0"),bonus);
    }

    @Test
    void bonusShouldBeZeroToHighPaidEmployee(){
        BonusService service = new BonusService();

        assertThrows(IllegalArgumentException.class, () -> service.calculateBonus(
                new Employee("Joe", LocalDate.now(), new BigDecimal("25000"))));
    }

}
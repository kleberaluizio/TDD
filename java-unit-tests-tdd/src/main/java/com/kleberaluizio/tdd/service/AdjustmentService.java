package com.kleberaluizio.tdd.service;

import com.kleberaluizio.tdd.model.Employee;
import com.kleberaluizio.tdd.model.Performance;

import java.math.BigDecimal;

public class AdjustmentService {

    public void grantAdjustment(Employee employee, Performance performance){

        BigDecimal percentage = performance.adjustmentPercentage();
        BigDecimal adjustment = employee.getSalary().multiply(percentage);
        employee.readjustSalary(adjustment);
    }
}

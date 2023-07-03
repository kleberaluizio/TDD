package com.kleberaluizio.tdd.service;

import com.kleberaluizio.tdd.model.Employee;
import com.kleberaluizio.tdd.model.Performance;

import java.math.BigDecimal;

public class AdjustmentService {

    public void grantAdjustment(Employee employee, Performance performance){

        BigDecimal adjustment;
        switch (performance){
            case NOT_GOOD:
                adjustment = employee.getSalary().multiply(new BigDecimal("0.03"));
                employee.readjustSalary(adjustment);
                break;
            case GOOD:
                adjustment = employee.getSalary().multiply(new BigDecimal("0.15"));
                employee.readjustSalary(adjustment);
                break;
            case GREAT:
                adjustment = employee.getSalary().multiply(new BigDecimal("0.20"));
                employee.readjustSalary(adjustment);
        }
    }
}

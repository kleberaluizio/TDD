package com.kleberaluizio.tdd.service;

import java.math.BigDecimal;

import com.kleberaluizio.tdd.model.Employee;

public class BonusService {

	public BigDecimal calculateBonus(Employee employee) {
		BigDecimal value = employee.getSalary().multiply(new BigDecimal("0.1"));
		if (value.compareTo(new BigDecimal("1000")) > 0) {
			value = BigDecimal.ZERO;
		}
		return value;
	}

}

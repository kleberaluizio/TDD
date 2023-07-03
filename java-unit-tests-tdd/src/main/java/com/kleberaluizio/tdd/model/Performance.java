package com.kleberaluizio.tdd.model;

import java.math.BigDecimal;

public enum Performance {
    NOT_GOOD {
        @Override
        public BigDecimal adjustmentPercentage() {
            return new BigDecimal("0.03");
        }
    }, GOOD {
        @Override
        public BigDecimal adjustmentPercentage() {
            return new BigDecimal("0.15");
        }
    }, GREAT {
        @Override
        public BigDecimal adjustmentPercentage() {
            return new BigDecimal("0.20");
        }
    };

    public abstract BigDecimal adjustmentPercentage();
}

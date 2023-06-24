package com.example.jazs23466nbp.model;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Rate {
    private BigDecimal mid;

    public BigDecimal getMid() {
        return mid;
    }

    public void setMid(BigDecimal mid) {
        this.mid = mid;
    }
}
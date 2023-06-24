package com.example.jazs23466nbp.model;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
public class CurrencyRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID")
    private int id;
    @Schema(description = "Currecy")
    private String currency;
    @Schema(description = "Start Date")
    private LocalDate startdate;
    @Schema(description = "End Date")
    private LocalDate enddate;
    @Schema(description = "Rate")
    private double rate;
    @Schema(description = "Current Date")
    private LocalDate date;


    public CurrencyRate(int id, String currency, LocalDate startdate, LocalDate enddate, double rate, LocalDate date) {
        this.id = id;
        this.currency = currency;
        this.startdate = startdate;
        this.enddate = enddate;
        this.rate = rate;
        this.date = date;
    }

    public CurrencyRate() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

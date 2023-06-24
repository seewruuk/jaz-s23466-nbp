package com.example.jazs23466nbp.service;


import com.example.jazs23466nbp.repository.CurrencyRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Service
public class MainService {


    RestTemplate restTemplate;


    public MainService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getApi(String currency, LocalDate startDate, LocalDate endDate) {
        String url = "http://api.nbp.pl/api/exchangerates/rates/a/" + currency + "/" + startDate + "/" + endDate + "?format=json";

        try {
            return restTemplate.getForObject(url, String.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

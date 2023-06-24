package com.example.jazs23466nbp.controller;


import com.example.jazs23466nbp.service.MainService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping("/")
public class MainController {


    private MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @Tag(name = "Kontroler", description = "NBP")
    @Operation(summary = "Pram powinien wysietlic sredniy kurs w danych dniach", description = "Desc")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Wykonane pomyślnie", content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", description = "Niepoprawny kod waluty lub nieprawidłowa data", content = @Content),
            @ApiResponse(responseCode = "404", description = "Nie znaleziono danych dla zapytania", content = @Content),
            @ApiResponse(responseCode = "500", description = "Błąd serwera", content = @Content)
    })
    @GetMapping("/api/{cur}/{startDate}/{endDate}")
    public ResponseEntity<String> string(
            @PathVariable String cur,
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate
    ) {

        // wiem, że powinno zwracać double, ale nie wiem jak to obsłużyć
        String test = mainService.getApi(cur, startDate, endDate);
        return ResponseEntity.ok(test);




    }
}

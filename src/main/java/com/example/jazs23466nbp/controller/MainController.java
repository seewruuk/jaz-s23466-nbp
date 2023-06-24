package com.example.jazs23466nbp.controller;


import com.example.jazs23466nbp.service.MainService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {


    private MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/string")
    public ResponseEntity<String> string(){
        String test = mainService.getString();
        return ResponseEntity.ok(test);

    }
}

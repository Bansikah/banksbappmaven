package org.example.bankingappspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/demo")
public class DemoController {
    private int counter;

    @GetMapping
    public String demo() {
        counter++;
        return String.format("<h1>Hello World from demo Controller, number of people who visited %d<h1/>", counter);
    }
}

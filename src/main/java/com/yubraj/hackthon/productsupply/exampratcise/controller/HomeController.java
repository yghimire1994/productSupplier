package com.yubraj.hackthon.productsupply.exampratcise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping(value = "productsupply")
    public String displayHome() {
        return "HomePage";
    }
}
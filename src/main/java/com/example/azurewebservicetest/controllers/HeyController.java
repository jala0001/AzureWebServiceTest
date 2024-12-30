package com.example.azurewebservicetest.controllers;


import com.example.azurewebservicetest.services.HeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HeyController {

    @Autowired
    private HeyService heyService;


    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("heys", heyService.getAllHeys());
        return "index";
    }

    @PostMapping("/createHey")
    public String createHey(@RequestParam String hey) {
        heyService.createHey(hey);
        return "redirect:/";
    }
}

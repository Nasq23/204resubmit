package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/cartime")
    public String loadTvForm(Model model){
        Carshow carshow = new Carshow();
        model.addAttribute("carshow", carshow);
        return "cartime";
    }

   @PostMapping("/cartime")
   public String processCarTime(@Valid Carshow carshow,
       BindingResult result){
       if (result.hasErrors()) {
           return "cartime";
       }
       return "carshowconfirm";
    }
}
package com.simple.basic.controller;

import command.DemoVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/valid")
public class QuizController {
    @GetMapping("/quiz01")
    public String quiz01() {
        return "valid/quiz01";
    }

    @GetMapping("/quiz01_result")
    public String quiz01_result() {
        return "valid/quiz01_result";
    }

    @PostMapping("/join")
    public String join(@Valid @ModelAttribute("vo") DemoVO vo, BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "valid/quiz01";
        }


        //처리
        return "redirect:/valid/quiz01_result";
    }

}

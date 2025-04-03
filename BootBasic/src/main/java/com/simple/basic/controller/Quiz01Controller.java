package com.simple.basic.controller;

import command.SimpleVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Controller
@RequestMapping("/view")
public class Quiz01Controller {

    @GetMapping("/quiz01")
    public String quiz01(Model model) {


        SimpleVO vo =  new SimpleVO();
                vo.setId(1234);
                vo.setName("홍길동");
                vo.setDate(LocalDateTime.now());

        model.addAttribute("vo", vo);
        return "view/quiz01";
    }

    @GetMapping("/quiz_result")
    public String quiz_result(@RequestParam int id,
                              @RequestParam String name,Model model) {


        System.out.println(id + ", " + name + ", " + model);
        SimpleVO vo = SimpleVO
                .builder()
                .id(id)
                .name(name)
                .date(LocalDateTime.now())
                .build();

        model.addAttribute("vo", vo);
        System.out.println(vo);

        return "view/quiz_result";
    }




}

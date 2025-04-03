package com.simple.basic.controller;

import command.DemoVO;
import command.ValidVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/valid")
public class VaildController {

    //화면처리
    @GetMapping("/view")
    public String view() {
        return "valid/view";
    }

    //결과화면 화면처리
    @GetMapping("/result")
    public String result() {
        return "valid/result";
    }

    //가입요청
    @PostMapping("/joinForm")
    public String joinForm(@Valid @ModelAttribute("vo") ValidVO vo, BindingResult result, Model model) {
        //1st
//        //유효성검사를 진행하고, 실패한 목록을 bindingresult에 담아줍니다
//
//        if (result.hasErrors()) {//유효성검사에 실패하면 true
//
//            List<FieldError> list = result.getFieldErrors();
//            for(FieldError err : list) {
//                System.out.println(err.getField()); //실패한 필드명
//                System.out.println(err.getDefaultMessage());//실패한 필드명 message
//                model.addAttribute("valid_" + err.getField(), err.getDefaultMessage());
//            }
//            return "valid/view";
//        }

        if (result.hasErrors()) {
            return "valid/result";
        }

        //처리
        return "redirect:/valid/result";
    }




}

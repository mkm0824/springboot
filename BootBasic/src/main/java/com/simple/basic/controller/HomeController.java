package com.simple.basic.controller;

import command.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class HomeController {



    @ResponseBody
    @GetMapping ("/")
    public String home() {


        //TestVO vo = new TestVO();
        return "home";


    }


    }




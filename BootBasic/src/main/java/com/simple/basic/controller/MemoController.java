package com.simple.basic.controller;


import command.TestVO;
import lombok.RequiredArgsConstructor;
import com.simple.basic.memoservice.MemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
@RequestMapping("/memo")
@RequiredArgsConstructor
public class MemoController {

    //멤버변수 주입
//    @Autowired
//    @Qualifier("memoService")
//    private MemoService memoService;

    //생성자 주입
//    @Autowired
//    public MemoController(MemoService service) {
//        this.memoService = memoService;
//    }

    private final MemoService memoService; //반드시 final 필드로 생성

    //글작성화면
    @GetMapping("/memoWrite")
    public String memoWrite() {

        return "memo/memoWrite";
    }

    @PostMapping("/memoForm")
    public String memoForm(@Valid @ModelAttribute("vo") TestVO vo, Model model) {




        return "memo/memoList";
    }


    @GetMapping("/memoList")
    public String memoList(Model model) {

        ArrayList<TestVO> list = memoService.getList();
        model.addAttribute("list", list);

        return "redirect:/memo/memoList";
    }





}

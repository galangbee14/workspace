package com.green.DataPractice.controller;

import com.green.DataPractice.vo.StudentVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScoreController {

    @GetMapping("/start")
    public String naming (){
        return "input_1";
    }

    @PostMapping("/input_1")
    public String input (StudentVO studentVO){
        System.out.println(studentVO);
        return "input_2";
    }
}

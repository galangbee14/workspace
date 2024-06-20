package com.green.Start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScoreController {

    //시작페이지로 이동
    @GetMapping("/first")
    public String first(){
        return "score_first";
    }

}

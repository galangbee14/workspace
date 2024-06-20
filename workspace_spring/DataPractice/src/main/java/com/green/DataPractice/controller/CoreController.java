package com.green.DataPractice.controller;

import com.green.DataPractice.vo.ScoreVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLOutput;

@Controller
public class CoreController {

    @GetMapping("/first")
    public String first() {
        return "score_first";
    }

    //첫번째 페이지에서 넘어온 데이터 받아, 두번째 페이지로 이동
    @PostMapping("/second")
    public String second(ScoreVO scoreVO){  //커맨드 객체!! ScoreVO 클래스와 매게변수 이름일치!!, 자동으로 data 받아옴
        System.out.println(scoreVO);
        return "score_second";
    }
    //원래는 java에서 html로 보내려면, Model&addAtribute사용 해야됨, 커맨드 객체는 예외

    //세번째 페이지로 이동
    @PostMapping("/third")
    public String third(ScoreVO scoreVO){
        System.out.println(scoreVO);
        return "score_third";
    }

    //네번째 페이지로 이동
    @PostMapping("/fourth")
    public String fourth(ScoreVO scoreVO, Model model){
        System.out.println(scoreVO);
        //평균
        double avg = (scoreVO.getKorScore() + scoreVO.getKorScore() + scoreVO.getMathScore()) / 3.0;
        model.addAttribute("avg", avg);

        return "score_fourth";

    }

}

//template might not exist --> 콘솔 오류, html template 파일 없음
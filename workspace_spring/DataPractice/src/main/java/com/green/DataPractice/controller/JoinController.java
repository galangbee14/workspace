package com.green.DataPractice.controller;

import com.green.DataPractice.vo.MemberVO;
import com.green.DataPractice.vo.SurveyVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//6.19 4교시 문제풀이
@Controller
public class JoinController {

    @GetMapping("/reg")     //마음대로 입력, 웹주소 마지막과 일치
    public String regMember (){
        return "reg_member";   //reg_member html로 이동
    }

    //컨트롤러 클래스의 메소드의 매개변수를 커맨드 객체라고 함
    //커맨드 객체는 자동으로 html 데이터 넘어감

    //커맨드 객체는 model을 사용하지 않아도 자동으로 html로 전달된다.
    //이때 넘어가는 데이터는 클래스명에서 앞글자만 소문자로 바꾼 이름으로 넘어간다!
    @PostMapping("/result")     //reg_member html의 submit클릭시 action의 result와 동일하게 입력
    public String result(MemberVO memberVO){
        System.out.println(memberVO);
        return "member_info";    //member_info html로 이동
    }

    @GetMapping("/survey")
    public String survey(){
        return "survey";
    }

    @PostMapping("/sResult")
    public String sResult(SurveyVO surveyVO){
        System.out.println(surveyVO);
        return "survey_result";
    }

    @GetMapping("/a")
    public String inputName(){
        return "input_name";
    }

    @PostMapping("/b")
    public String inputAge(@RequestParam(name = "name") String name, Model model){
        System.out.println(name);
        model.addAttribute("name", name);
        return "input_age";
    }

    @PostMapping("/c")
    public String show(@RequestParam(name = "name") String name, @RequestParam(name = "age") int a){
        return "show";
    }

}

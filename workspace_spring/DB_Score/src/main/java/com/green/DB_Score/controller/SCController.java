package com.green.DB_Score.controller;

import com.green.DB_Score.service.ScoreService;
import com.green.DB_Score.service.ScoreServiceImpl;
import com.green.DB_Score.vo.StudentVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SCController {
    @Resource(name = "scoreService")
    private ScoreServiceImpl scoreService;

    //학생 목록 페이지
    @GetMapping("/")
    public String studentList(Model model){

        //학생 목록 데이터를 db에서 조회
        List<StudentVO> stuList = scoreService.getStuList();
        model.addAttribute("stuList", stuList);
        return "stu_list";
    }

    //학생 등록 페이지로 이동
    @GetMapping("/regForm")
    public String regForm(){
        return "reg_student";
    }

    //학생 등록, 목록페이지로 이동
    @PostMapping("/reg")
    public String reg(StudentVO studentVO){
        scoreService.insertStudent(studentVO);
        return "redirect:/";
    }

    //학생 상세 정보 페이지로 이동
    @GetMapping("/stuDetail")
    //첫번째 방식
    //public String stuDetail(StudentVO studentVO){
    //두번재 방식
    public String stuDetail(@RequestParam(name = "stuNum") int stuNum, Model model){

        //클릭한 학생 정보를 디비에서 조회
        //첫번재 방식
        // scoreService.getStuDetail(studentVO.getStuNum());
        //두번째 방식
        StudentVO student = scoreService.getStuDetail(stuNum);
        model.addAttribute("student", student);

        return "student_detail";
    }

    //학생 삭제 + 목록페이지로 이동
    @GetMapping("/stuDelete")
    public String delete(@RequestParam(name = "stuNum") int stuNum){
        scoreService.deleteStudent(stuNum);
        return "redirect:/";
    }

    //학생 정보 수정 페이지로 이동
    @GetMapping("/updateForm")
    public String updateForm(@RequestParam(name = "stuNum") int stuNum, Model model){

        //정보를 수정할 학생을 조회
        StudentVO student = scoreService.getStuDetail(stuNum);
        model.addAttribute("student", student);
        return "update_student";
    }

    //학생 정보 수정 + 상세 페이지
    @PostMapping("/updateStudent")
    public String updateStudent(StudentVO studentVO){
        scoreService.updateStudent(studentVO);

        return "redirect:/stuDetail?stuNum=" + studentVO.getStuNum();
    }

}

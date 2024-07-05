package com.green.BasicBoard.controller;

import com.green.BasicBoard.service.BoardServiceImpl;
import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BoardController {
    @Resource(name= "boardService")
    private BoardServiceImpl boardService;

    //RequestMapping은 GetMapping PostMapping 둘 다 됨
    //게시글 목록 페이지
    @RequestMapping("/")
    public String list(Model model, SearchVO searchVO){
        //searchVO 데이터 검사
        System.out.println(searchVO);

        //목록 조회
        List<BoardVO> boardList = boardService.getBoardList(searchVO);
        model.addAttribute("boardList", boardList);

        //위와 동일
        //model.addAttribute("boardList", boardService.getBoardList());
        return "board_list";
    }

    //글쓰기 페이지로 이동
    @GetMapping("/insertForm")
    public String insertForm(){
        return "write_form";
    }

    //글 등록, 게시글 목록 페이지로 이동
    @PostMapping("/insertBoard")
    public String insertBoard(BoardVO boardVO){
        boardService.insertBoard(boardVO);
        return "redirect:/";
    }

    @GetMapping("/boardDetail")
    public String boardDetail(@RequestParam(name = "boardNum") int boardNum, Model model){

        return "board_detail";
    }

}

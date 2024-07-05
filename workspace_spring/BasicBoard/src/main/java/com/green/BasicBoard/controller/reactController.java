package com.green.BasicBoard.controller;

import com.green.BasicBoard.service.BoardServiceImpl;
import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class reactController {
    @Resource(name= "boardService")
    private BoardServiceImpl boardService;

    //RequestMapping은 GetMapping PostMapping 둘 다 됨
    //게시글 목록 페이지
    @RequestMapping("/list")
    public List<BoardVO> list(Model model, SearchVO searchVO){


        //목록 조회
        List<BoardVO> boardList = boardService.getBoardList(searchVO);

        return boardList;
    }



}

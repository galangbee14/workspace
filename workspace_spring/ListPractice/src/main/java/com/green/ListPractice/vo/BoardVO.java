package com.green.ListPractice.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
//@ToString
@Data
//VO :Value Object
//DTO (BoardDTO) : Data Transfer Object
public class BoardVO {
    private int boardNum; //글번호
    private String title; //제목
    private String writer; //작성자
    private String createDate; //작성일
    private String content;
}

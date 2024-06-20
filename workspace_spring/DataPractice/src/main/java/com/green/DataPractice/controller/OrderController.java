package com.green.DataPractice.controller;

import com.green.DataPractice.vo.DeliveryVO;
import com.green.DataPractice.vo.OrderVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    //주문정보페이지 이동
    @GetMapping("/startOrder")
    public String firstOrder(){
        return "order_first";
    }

    //배달정보페이지로 이동
    @PostMapping("/secondOrder")
    public String secondOrder(OrderVO orderVO) {
        System.out.println(orderVO);
        return "delivery";
    }

    //주문정보 확인 페이지로 이동
    @PostMapping("/info")
    public String info(OrderVO orderVO, DeliveryVO deliveryVO){
        return "order_info";
    }


}

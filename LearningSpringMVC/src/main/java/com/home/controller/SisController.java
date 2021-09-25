package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SisController {

    @ResponseBody
    @RequestMapping("/makeup")
    public String getMakeUoKit() {
        return "Ok... this is the kit!!!";
    }

    @ResponseBody
    @RequestMapping("/book")
    public String getBook(){
        return "Here is your match book!!!!";
    }


}

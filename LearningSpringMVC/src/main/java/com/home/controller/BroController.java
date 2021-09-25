package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bro")
public class BroController {

    @ResponseBody
    @RequestMapping("/cricketbat")
    public String giveCricketBat() {
        return "Ok... This is the cricket bat!!!";
    }

    @RequestMapping("/page")
    public String getPage() {
        return "bropage";
    }
}

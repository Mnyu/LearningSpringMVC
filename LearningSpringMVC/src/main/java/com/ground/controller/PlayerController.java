package com.ground.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/player")
public class PlayerController {

    @ResponseBody
    @RequestMapping("/all")
    public String getPlayerNames() {
        return "Sachin Rahul Sourav";
    }
}

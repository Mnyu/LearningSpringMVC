package com.home.mycafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyCafeController {

    @RequestMapping("/cafe")
    public String showWelcomePage() {
        return "welcomePage";
    }

    @RequestMapping("/processOrder")
    public String processOrder(HttpServletRequest request, Model model) {

        // handle the data received from user
        String foodName = request.getParameter("foodType");

        // set user data in model object and send to view
        model.addAttribute("userInput", foodName);

        return "processOrder";
    }

}

package com.it.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.it.pojo.User;
import com.it.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request,Model model){
    	//访问时需要带参数
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.selectByPrimaryKey(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}
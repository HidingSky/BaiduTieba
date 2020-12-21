package com.lanou3g.dlnu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
//没忘了我吧兄弟
    @RequestMapping("/addPage")
    public String addPage() {
        return "hero_add";
    }

    @RequestMapping("/home_page")
    public String homePage(){
        return "home_page";
    }

    @RequestMapping("/registered_page")
    public String registered_page(){
        return "registered_page";
    }

    @RequestMapping("/register_or_login_page")
    public String register_or_login_page(){
        return "register_or_login_page";
    }

    @RequestMapping("/login_page")
    public String login_page(){
        return "login_page";
    }

    @RequestMapping("/login_success_page")
    public String login_success_page(){
        return "login_success_page";
    }

    @RequestMapping("/tiezi_page")
    public String tiezi_page(){return "tiezi_page";}

    @RequestMapping("/personal_page")
    public String personal_page(String name, Model model){
        model.addAttribute("name",name);
        return "personal_page";
    }

    @RequestMapping("/duotieba_filed_page")
    private String duotieba_filed_page(){
        return "duotieba_filed_page";
    }




}

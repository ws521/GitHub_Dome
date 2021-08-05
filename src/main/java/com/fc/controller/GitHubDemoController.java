package com.fc.controller;


import com.fc.config.ObjectConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hub")
public class GitHubDemoController {
    @Autowired
    ObjectConfig objectConfig;

    @RequestMapping("show")
    public void show() {
        System.out.println(objectConfig);
        System.out.println("提交");
        System.out.println("提交");
        System.out.println("提交");
    }
}

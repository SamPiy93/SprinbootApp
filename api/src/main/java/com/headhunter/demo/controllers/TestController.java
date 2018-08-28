package com.headhunter.demo.controllers;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.headhunter.demo.bean.HeadHunter;
import com.headhunter.demo.services.HeadHunterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @Autowired
    HeadHunterService headHunterService;

    @RequestMapping("/")
    public @ResponseBody String index() {
        return this.gson.toJson("Welcome to Springboot!");
    }


    @RequestMapping("/headhunter/list")
    public String listAllClients() {
        List<HeadHunter> headHunterList = this.headHunterService.headHuntersList();
        return this.gson.toJson(headHunterList);
    }
}

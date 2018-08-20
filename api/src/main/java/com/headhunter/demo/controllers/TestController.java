package com.headhunter.demo.controllers;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.headhunter.demo.models.TestModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @RequestMapping("/")
    public String index() {
        return "Welcome to Springboot!";
    }

    @RequestMapping("/clients")
    public String getClients() {
        TestModel testModel = new TestModel();
        testModel.setName("John");
        testModel.setAge(25);
        return this.gson.toJson(testModel);
    }
}

package com.headhunter.demo.controllers;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.headhunter.demo.bean.Client;
import com.headhunter.demo.bean.TestModel;
import com.headhunter.demo.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class TestController {
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @Autowired
    ClientService clientService;

    @RequestMapping("/")
    public @ResponseBody String index() {
        return this.gson.toJson("Welcome to Springboot!");
    }

    @RequestMapping("/clients")
    public @ResponseBody String getClients() {
        List<TestModel> testModels = new LinkedList<>();
        TestModel testModel = new TestModel();
        testModel.setName("John");
        testModel.setAge(25);
        testModels.add(testModel);
        testModel.setName("Ebraham");
        testModel.setAge(28);
        testModels.add(testModel);
        return this.gson.toJson(testModels);
    }

    @RequestMapping("/client/list")
    public String listAllClients() {
        List<Client> clients = this.clientService.listClients();
        return this.gson.toJson(clients);
    }
}

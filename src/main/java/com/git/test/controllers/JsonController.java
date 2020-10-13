package com.git.test.controllers;
import com.git.test.Config.MainConfig;
import com.git.test.Model.JsonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class JsonController {


    private final MainConfig mainConfig;

    @Autowired
    public JsonController(MainConfig mainConfig) {
        this.mainConfig = mainConfig;
    }


    @GetMapping("/json/1")
    public JsonModel LoadJson() throws IOException {
        System.out.println("pre");
        return  mainConfig.JsonLoadFromFile();
    }

    @GetMapping("json/2")
    public JsonModel LoadJsonBigger() throws IOException {
        return mainConfig.JsonLoadFromBiggerFile();
    }

}

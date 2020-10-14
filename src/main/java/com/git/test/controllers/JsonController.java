package com.git.test.controllers;

import com.git.test.Config.JsonFileReader;
import com.git.test.Model.JsonModel;
import com.git.test.service.JsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.logging.Logger;

@RestController
public class JsonController {

    private final Logger log = Logger.getLogger(this.getClass().getName());
    private final JsonService jsonService;

    @Autowired
    public JsonController(JsonService jsonService) {
        this.jsonService = jsonService;
    }

    @GetMapping("json/{dictionaryId}")
    public JsonModel loadJsonById(@PathVariable String dictionaryId) throws  IllegalAccessException {
        log.info("Method called loadJsonById with param " + dictionaryId);
        return jsonService.getDataJson(dictionaryId);
    }
}

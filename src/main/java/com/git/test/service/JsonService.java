package com.git.test.service;

import com.git.test.Config.JsonFileReader;
import com.git.test.Model.JsonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JsonService {

    private final JsonFileReader jsonFileReader;

    @Autowired
    public JsonService(JsonFileReader jsonFileReader) {
        this.jsonFileReader = jsonFileReader;
    }

    public JsonModel getDataJson(String dictionaryId) throws IllegalAccessException {
        return jsonFileReader.JsonLoadFromFileById(dictionaryId);
    }
}

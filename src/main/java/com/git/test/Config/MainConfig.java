package com.git.test.Config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.git.test.Model.JsonModel;
import org.springframework.stereotype.Component;
import java.io.File;
import java.io.IOException;

@Component
public class MainConfig {

    JsonModel jsonModel;


    private ObjectMapper objectMapper = new ObjectMapper();

    public JsonModel JsonLoadFromFile() throws IOException {
        String filePathStatus = "src/main/resources/jsonDirector/StatusPostepowanEnum.example.json";
        jsonModel = objectMapper.readValue(new File(filePathStatus), JsonModel.class);
        System.out.println(jsonModel);
        return jsonModel;
    }
    public JsonModel JsonLoadFromBiggerFile() throws  IOException {
        String filePathType = "src/main/resources/jsonDirector/RodzajInstytucjiEnum.example.json";
        jsonModel = objectMapper.readValue(new File(filePathType), JsonModel.class);
        System.out.println(jsonModel);
        return  jsonModel;
    }

}

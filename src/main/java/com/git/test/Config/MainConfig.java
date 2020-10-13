package com.git.test.Config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.git.test.Model.JsonModel;
import com.git.test.controllers.JsonController;
import org.springframework.stereotype.Component;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class MainConfig {

    private final static Logger LOGGER = Logger.getLogger(JsonController.class.getName());

    JsonModel jsonModel;
    private final String filePathType = "src/main/resources/jsonDirector/RodzajInstytucjiEnum.example.json";
    private final String filePathStatus = "src/main/resources/jsonDirector/StatusPostepowanEnum.example.json";
    private String path;
    private ObjectMapper objectMapper = new ObjectMapper();


    public JsonModel JsonLoadFromFileById(String id)  throws IOException{
        jsonModel = new JsonModel(id);
            if (id.equals("RodzajInstytucjiEnum")) {
                LOGGER.setLevel(Level.INFO);
                LOGGER.info("Pobrano Rodzaj");
                path = filePathType;
            }

            else if(id.equals("StatusPostepowanEnum")) {
                LOGGER.setLevel(Level.INFO);
                LOGGER.info("Pobrano Status");
                path = filePathStatus;
            }
            jsonModel = objectMapper.readValue(new File(path), JsonModel.class);
            return jsonModel;


        }

}

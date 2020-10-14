package com.git.test.Config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.git.test.Model.JsonModel;
import com.git.test.controllers.JsonController;
import org.springframework.stereotype.Component;
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

@Component
public class JsonFileReader {

    private final static Logger LOGGER = Logger.getLogger(JsonController.class.getName());
    private final String FILE_TYPE_PATH = "src/main/resources/jsonDirector/RodzajInstytucjiEnum.example.json";
    private final String FILE_STATUS_PATH = "src/main/resources/jsonDirector/StatusPostepowanEnum.example.json";
    private final ObjectMapper objectMapper = new ObjectMapper();

    public JsonModel JsonLoadFromFileById(String id) throws IllegalAccessException {
        try {
            return objectMapper.readValue(new File(getPath(id)), JsonModel.class);
        } catch (IOException e) {
            LOGGER.warning("Blad podczas cos tam");
        }
        throw new IllegalAccessException("aa");
    }

    private String getPath(String id) {
        if (id.equals("RodzajInstytucjiEnum")) {
            LOGGER.info("Pobrano Rodzaj");
            return FILE_TYPE_PATH;
        } else if (id.equals("StatusPostepowanEnum")) {
            LOGGER.info("Pobrano Status");
            return FILE_STATUS_PATH;
        } else {
            throw new IllegalArgumentException("Zle id");
        }
    }
}

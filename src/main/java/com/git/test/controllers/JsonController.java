package com.git.test.controllers;
import com.git.test.Config.MainConfig;
import com.git.test.Model.JsonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class JsonController {

    private final static Logger LOGGER = Logger.getLogger(JsonController.class.getName());
    private final MainConfig mainConfig;

    @Autowired
    public JsonController(MainConfig mainConfig) {
        this.mainConfig = mainConfig;
    }

    @GetMapping("json/{dictionaryId}")
    public JsonModel LoadJsonById(@PathVariable String dictionaryId) throws IOException {
        LOGGER.setLevel(Level.INFO);
        LOGGER.info("Pobrano");
        return mainConfig.JsonLoadFromFileById(dictionaryId);
    }

}

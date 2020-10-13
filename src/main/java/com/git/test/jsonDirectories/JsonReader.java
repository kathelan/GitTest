package com.git.test.jsonDirectories;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;
import java.io.FileReader;
import java.io.IOException;


@Component
public class JsonReader {

    public void ReadFromFile(String path) {

        try (FileReader reader = new FileReader(ClassLoader.getSystemResource(path).getFile())) {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            String id = (String) jsonObject.get("dictionaryId");
            System.out.println("id "+ id);

            JSONArray items = (JSONArray) jsonObject.get("items");

            for(int i = 0; i < items.size(); i++) {
                System.out.println("Element:  " + i + " of " + items.get(i));
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

}



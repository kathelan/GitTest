package com.git.test.Model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

public class JsonModel {

    private String dictionaryId;
    private String validFrom;
    private String validTo;
    private String version;
    private String language;
    private List items;

    public JsonModel(String dictionaryId) {
         this.dictionaryId = dictionaryId;
    }

    JsonModel() {

    }

    public List getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }

    public String getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(String dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "JsonModel{" +
                "dictionaryId='" + dictionaryId + '\'' +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                ", version='" + version + '\'' +
                ", language='" + language + '\'' +
                ", items=" + items +
                '}';
    }
}

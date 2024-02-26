package com.example.ex1_2_dictionary.model;

public class DictionaryResult {
    private  String vnString;
    private String enString;

    public DictionaryResult(String vnString, String enString) {
        this.vnString = vnString;
        this.enString = enString;
    }

    public DictionaryResult() {
    }

    public String getVnString() {
        return vnString;
    }

    public void setVnString(String vnString) {
        this.vnString = vnString;
    }

    public String getEnString() {
        return enString;
    }

    public void setEnString(String enString) {
        this.enString = enString;
    }
}

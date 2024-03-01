package com.tahahanci.kodlamaiodevs.entities;

public class Language {

    private int languageID;
    private String languageName;

    public Language(int languageID, String languageName) {
        this.languageID = languageID;
        this.languageName = languageName;
    }

    public int getLanguageID() {
        return languageID;
    }

    public void setLanguageID(int languageID) {
        this.languageID = languageID;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
}

package com.tahahanci.kodlamaiodevs.services.abstracts;

import com.tahahanci.kodlamaiodevs.entities.Language;

import java.util.List;

public interface LanguageService {

    List<Language> getAll();

    Language findByID(int id);

    void add(Language language);

    void delete(int id);

    void update(int id, Language languageToUpdate);
}

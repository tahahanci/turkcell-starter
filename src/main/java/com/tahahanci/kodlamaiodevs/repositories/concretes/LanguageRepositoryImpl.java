package com.tahahanci.kodlamaiodevs.repositories.concretes;

import com.tahahanci.kodlamaiodevs.entities.Language;
import com.tahahanci.kodlamaiodevs.repositories.abstracts.LanguageRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LanguageRepositoryImpl implements LanguageRepository {

    private List<Language> languageList = new ArrayList<>();

    public LanguageRepositoryImpl(List<Language> languageList) {
        this.languageList = languageList;
    }

    @Override
    public List<Language> getAll() {
        return languageList;
    }

    @Override
    public Language findByID(int id) {
        for (Language language : languageList) {
            if (language.getLanguageID() == id)
                return language;
        }
        return null;
    }

    @Override
    public void add(Language language) {
        languageList.add(language);
    }

    @Override
    public void delete(int id) {
        Language deletedLanguage = findByID(id);
        languageList.remove(deletedLanguage);
    }

    @Override
    public void update(int id, Language languageToUpdate) {
        int i = 0;
        for (Language language : languageList) {
            if (languageToUpdate.getLanguageID() == id) {
                i = languageList.indexOf(language);
            }
        }
        languageList.set(i, languageToUpdate);
    }
}

package com.tahahanci.kodlamaiodevs.services.concretes;

import com.tahahanci.kodlamaiodevs.entities.Language;
import com.tahahanci.kodlamaiodevs.repositories.abstracts.LanguageRepository;
import com.tahahanci.kodlamaiodevs.services.abstracts.LanguageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {

    private LanguageRepository languageRepository;

    public LanguageServiceImpl(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public Language findByID(int id) {
        return languageRepository.findByID(id);
    }

    @Override
    public void add(Language language) {
        if (checkLanguage(language)) {
            throw new RuntimeException("This language is already added.");
        }
        if (checkLanguageName(language)) {
            throw new RuntimeException("You have to give a name");
        }
        languageRepository.add(language);
    }

    @Override
    public void delete(int id) {
        Language language = languageRepository.findByID(id);
        if (language == null)
            throw new RuntimeException("There is no such an id.");
        languageRepository.delete(id);
    }

    @Override
    public void update(int id, Language languageToUpdate) {
        if (checkLanguage(languageToUpdate)) {
            throw new RuntimeException("This language is already added.");
        }
        if (checkLanguageName(languageToUpdate)) {
            throw new RuntimeException("You have to add a name.");
        }
        languageRepository.update(id, languageToUpdate);
    }

    private boolean checkLanguage(Language languageToCheck) {
        List<Language> languageList = languageRepository.getAll();
        for (Language language : languageList) {
            if (language.getLanguageName().equals(languageToCheck.getLanguageName())) {
                return true;
            }
        }
        return false;
    }

    private boolean checkLanguageName(Language language) {
        if (language.getLanguageName() == null)
            return true;
        else
            return false;
    }
}

package com.tahahanci.kodlamaiodevs.controllers;

import com.tahahanci.kodlamaiodevs.entities.Language;
import com.tahahanci.kodlamaiodevs.services.abstracts.LanguageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

    private LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping
    public List<Language> getAll() {
        return languageService.getAll();
    }

    @GetMapping({"/id"})
    public Language findByID(@RequestParam int id) {
        return languageService.findByID(id);
    }

    @PostMapping
    public void add(@RequestBody Language language) {
        languageService.add(language);
    }

    @DeleteMapping("/delete/id")
    public void delete(@RequestParam int id) {
        languageService.delete(id);
    }

    @PutMapping("/update/id")
    public void update(@RequestParam int id, @RequestBody Language language) {
        languageService.update(id, language);
    }
}

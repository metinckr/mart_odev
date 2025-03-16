package Mart_1_Hafta_Odev;

import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguageManager implements ProgrammingLanguageService{
    private final List<ProgrammingLanguage> programmingLanguages = new ArrayList<>();
    @Override
    public void addLanguage(ProgrammingLanguage language) {
        programmingLanguages.add(language);
        System.out.println("Dil eklendi: " + language.getName());
    }

    @Override
    public List<ProgrammingLanguage> listLanguages() {
        return programmingLanguages;
    }

    @Override
    public void deleteLanguage(int id) {
        programmingLanguages.removeIf(lang -> lang.getId() == id);
        System.out.println("Dil silindi: ID " + id);
    }

    @Override
    public void updateLanguage(ProgrammingLanguage language) {
        for (ProgrammingLanguage lang : programmingLanguages) {
            if (lang.getId() == language.getId()) {
                lang.setName(language.getName());
                System.out.println("Dil güncellendi: " + language.getName());
                return;
            }
        }
    }

    @Override
    public ProgrammingLanguage findLanguageById(int id) {
        return programmingLanguages.stream()
                .filter(lang -> lang.getId() == id)
                .findFirst()
                .orElse(null);
    }
}

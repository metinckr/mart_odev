package Mart_1_Hafta_Odev;

import java.util.List;

public interface ProgrammingLanguageService {
    void addLanguage(ProgrammingLanguage language);
    List<ProgrammingLanguage> listLanguages();
    void deleteLanguage(int id);
    void updateLanguage(ProgrammingLanguage language);
    ProgrammingLanguage findLanguageById(int id);
}

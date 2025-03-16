package Mart_1_Hafta_Odev;

import java.util.List;

public interface TechnologyRepository {
    void add(Technology tech);
    List<Technology> getAll();
    void delete(int id);
    void update(Technology tech);
    Technology getById(int id);
}

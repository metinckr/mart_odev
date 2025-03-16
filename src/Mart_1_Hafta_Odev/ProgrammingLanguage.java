package Mart_1_Hafta_Odev;

public class ProgrammingLanguage {
    private int ıd;

    private String name;
   //Programlama dili adı (örn: C#, Java, Python)
    public int getId() {
        return ıd;
    }

    public void setId(int ıd) {
        this.ıd = ıd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProgrammingLanguage(int ıd, String name) {
        this.ıd = ıd;
        this.name = name;
    }
}

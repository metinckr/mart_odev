package Mart_1_Hafta_Odev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProgrammingLanguageManager languageManager = new ProgrammingLanguageManager();

        boolean devam = true;
        while (devam) {
            System.out.println("1. Dil Ekle");
            System.out.println("2. Dilleri Listele");
            System.out.println("3. Dil Sil");
            System.out.println("4. Dil Güncelle");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("Dil adı: ");
                    String ad = scanner.nextLine();
                    languageManager.addLanguage(new ProgrammingLanguage(languageManager.listLanguages().size() + 1, ad));
                    break;
                case 2:
                    System.out.println("Diller:");
                    languageManager.listLanguages().forEach(lang -> System.out.println(lang.getId() + " - " + lang.getName()));
                    break;
                case 3:
                    System.out.print("Silinecek dilin ID'si: ");
                    int silId = scanner.nextInt();
                    languageManager.deleteLanguage(silId);
                    break;
                case 4:
                    System.out.print("Güncellenecek dilin ID'si: ");
                    int guncelleId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Yeni ad: ");
                    String yeniAd = scanner.nextLine();
                    languageManager.updateLanguage(new ProgrammingLanguage(guncelleId, yeniAd));
                    break;
                case 5:
                    devam = false;
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
        scanner.close();
        System.out.println("Uygulama sonlandırıldı.");
    }
}

package ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PhoneBook {
    private HashMap<String, String> Phonebook;
    public PhoneBook() {
        Phonebook = new HashMap<>();
    }
    public void Kontaktadd(String Adi, String TelefonNomresi) {
        Phonebook.put(Adi, TelefonNomresi);
        System.out.println("Kontakta elave edildi" + Adi + " " + TelefonNomresi);
    }
    public void Kontaktremove(String Adi) {
        if (Phonebook.containsKey(Adi)) {
            Phonebook.remove(Adi);
            System.out.println("Kontakta Silindi" + Adi);
        } else {
            System.out.println("Kontakta Tapilmadi");
        }
    }
    public void KontaktTapmaq(String Adi) {
        if (Phonebook.containsKey(Adi)) {
            System.out.println("Kontakta Siyahisi" + Adi + " " + Phonebook.get(Adi));
        } else {
            System.out.println("Kontakta Tapilmadi");
        }
    }
    public void KontaktListi() {
        if (Phonebook.isEmpty()) {
            System.out.println("Kontakta Listi");
        } else {
            for (Map.Entry<String, String> entry : Phonebook.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        boolean Çıxış = false;
        while (!Çıxış) {
            System.out.println("1. Kontakta Əlavə et");
            System.out.println("2. Kontakt Silindi");
            System.out.println("3. Kontakt Tapilmadi");
            System.out.println("4. Kontakt Siyahısı");
            System.out.println("5. Kontakdan Çıxış");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Ad Əlavə edin");
                    String Adi = scanner.nextLine();
                    System.out.println("Nömrəni daxil edin");
                    String TelefonNomresi = scanner.nextLine();
                    phonebook.Kontaktadd(Adi, TelefonNomresi);
                    break;
                case 2:
                    System.out.println("Silinəcək Kontakta Daxil Elə");
                    String KontaktSil = scanner.nextLine();
                    phonebook.Kontaktremove(KontaktSil);
                    break;
                case 3:
                    System.out.println("Axtardıxın Kontaktı Daxil Elə");
                    String KontaktAxtar = scanner.nextLine();
                    phonebook.KontaktTapmaq(KontaktAxtar);
                    break;
                case 4:
                    System.out.println("Siyahını Göster");
                    phonebook.KontaktListi();
                    break;
                case 5:
                    Çıxış = true;
                    System.out.println("Kontakdan Çıxış Edilir");
                    break;
                default:
                    System.out.println("Duzgun Secim Edin");
                    break;
            }
        }
        scanner.close();
//          PhoneBook phonebook = new PhoneBook();
//         System.out.println("Kontakt Menyu"+"\n1.Kontak Əlavə edin"+"\n2.Kontak Silin"+"\n3.Kontak Tapmaq"+"\n4.Kontak Listi");
//       Scanner scanner = new Scanner(System.in);
//        int choice = scanner.nextInt();
//        while (choice != 4)
    }
}

/*
 * Ad Soyad: Neva Yıldız
 * Ogrenci No: 250541034
 * Tarih: 30.10.2025
 * Aciklama: Gorev - Ogrenci Bilgi Sisteminde Gizli İsim
 *
 * Bu programın amacı, kullanıcıdan bir öğrencinin temel bilgilerini alarak
 * ismin ve soyismin ilk harfi dışında harflerin gizlenmesini sağlayarak bu bilgileri
 * düzenli bir biçimde ekranda görüntülemektedir.
 */


import java.util.Scanner;

public class GizliIsim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");

        // Bilgileri al
        System.out.print("Adinizi girin: ");
        String ad = input.nextLine();

        System.out.print("Soyadinizi girin: ");
        String soyad = input.nextLine();

        System.out.print("Ogrenci numaraniz: ");
        int ogrNo = input.nextInt();

        System.out.print("Yasiniz: ");
        int yas = input.nextInt();
        input.nextLine(); // satır temizliği

        System.out.print("GPA (0.00-4.00): ");
        String gpaStr = input.nextLine();
        gpaStr = gpaStr.replace(",", ".");
        double gpa = Double.parseDouble(gpaStr);

        // Ad ve soyadı yıldızlı hale getirme
        String gizliAd = gizleIsim(ad);
        String gizliSoyad = gizleIsim(soyad);

        // Durum belirle
        String durum;
        if (gpa >= 2.5) {
            durum = "Basarili Ogrenci";
        } else if (gpa >= 1.5) {
            durum = "Orta Duzey Ogrenci";
        } else {
            durum = "Basarisiz Ogrenci";
        }

        // Çıktı
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.println("Ad Soyad: " + gizliAd + " " + gizliSoyad);
        System.out.println("Ogrenci No: " + ogrNo);
        System.out.println("Yas: " + yas);
        System.out.println("GPA: " + gpa);
        System.out.println("Durum: " + durum);
    }

    // === Yardımcı metod: İsmi yıldızlarla gizler ===
    public static String gizleIsim(String isim) {
        if (isim.length() <= 2) {
            return isim; // 2 harften kısaysa gizleme yapma
        }

        String ilkIki = isim.substring(0, 2); // ilk 2 harf
        int kalan = isim.length() - 2;

        StringBuilder yildiz = new StringBuilder();
        for (int i = 0; i < kalan; i++) {
            yildiz.append("*");
        }

        return ilkIki + yildiz.toString();
    }
}

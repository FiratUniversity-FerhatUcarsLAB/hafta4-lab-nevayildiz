/*
 * Ad Soyad: Neva Yıldız
 * Ogrenci No: 250541034
 * Tarih: 30.10.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 *
 * Bu programın amacı, kullanıcıdan bir öğrencinin temel bilgilerini alarak
 * (ad, soyad, numara yas ve not ortalaması) bu bilgileri düzenli bir biçimde ekranda görüntülemektir.
 */


import java.util.Scanner;

public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");

        // Kullanıcıdan Bilgileri Al
        System.out.print("Adınızı Girin:  ");
        String ad = input.nextLine();

        System.out.print("Soyadınızı Girin: ");
        String soyad = input.nextLine();

        System.out.print("Öğrenci Numaranızı Girin: ");
        int ogrenci_no = input.nextInt();

        System.out.print("Yaşınızı Girin: ");
        int yas = input.nextInt();

        System.out.print("GPA Girin (0.00 - 4.00): ");
        double gpa = input.nextDouble();
        input.nextLine();
        // <<< satır sonu karakterini temizle

        // GPA'ya göre durum belirle
        String durum;
        if (gpa >= 2.5) {
            durum = "Basarili Ogrenci";
        } else if  (gpa >= 1.5) {
            durum = "Orta Duzey Ogrenci";
        } else {
            durum = "Basarisiz Ogrenci";

        }

        // Çıktı
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: " + ad + " " + soyad);
        System.out.printf("\nOğrenci No: " + ogrenci_no);
        System.out.printf("\nYas: " + yas);
        System.out.printf("\nGPA: " + gpa);
        System.out.println("\nDurum: " + durum);


    }
}

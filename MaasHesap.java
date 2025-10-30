
/*
 * Ad Soyad: Neva Yıldız
 * Ogrenci No: 250541034
 * Tarih: 30.10.2025
 * Aciklama: Gorev 3 - Maas Hesaplama Sistemi
 *
 * Bu programın amacı, çalışanın maaş bordrosunu otomatik olarak
 * hesaplamak ve ekrana düzenli biçimde yazdırmaktır.
 */


import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class MaasHesap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Sabit Oranlar
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;
        final int AYLIK_SAAT = 160; // (4 hafta * 40 saat)
        final int TOPLAM_SAAT = 176; // (22 gün * 8 saat);
        final int CALISMA_GUNU = 22;


        //Çalışan Bilgilerini Al
        System.out.println("=== MAAS HESAPLAMA SISTEMI ===\n");
        System.out.print("Çalışan Adı Soyadı: ");
        String adSoyad = scan.nextLine();

        System.out.print("Aylık Brüt Maaş (TL): ");
        double brutMaas = scan.nextDouble();

        System.out.print("Haftalık Çalışma Saati: ");
        int haftalikSaat = scan.nextInt();

        System.out.print("Mesai Saati Sayısı: ");
        int mesaiSaat = scan.nextInt();

        //Gelirler
        double MesaiUcreti = (brutMaas / AYLIK_SAAT) * mesaiSaat * 1.5 ;
        double toplamGelir = brutMaas + MesaiUcreti ;

        //Kesintiler
        double SGKKesinti = toplamGelir * SGK_ORANI ;
        double GelirVergisi = toplamGelir * GELIR_VERGISI_ORANI ;
        double DamgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI ;
        double ToplamKesinti = SGKKesinti + GelirVergisi + DamgaVergisi;

        //Net Maaşı Hesapla
        double NetMaas =  toplamGelir - ToplamKesinti;

        //Hesaplanacak İstatistikler
        double KesintiOrani = (ToplamKesinti / toplamGelir) * 100;
        double SaatlikNetKazanc = (NetMaas / TOPLAM_SAAT);
        double gunlukNetKazanc = NetMaas / CALISMA_GUNU;

        //Tarih
        LocalDate tarih = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String bugun =  formatter.format(tarih);

        //Çıktı

        System.out.println();
        System.out.println("======================================");
        System.out.println("            MAAS BORDROSU             ");
        System.out.println("======================================");
        System.out.printf("Calisan: %s%n", adSoyad);
        System.out.printf("Tarih: %s%n%n", bugun);

        System.out.println("GELIRLER: ");
        System.out.printf(" %-23s: %10.2f TL%n", "Brut Maas", brutMaas);
        System.out.printf(" Mesai Ucreti (%d saat) : %10.2f TL%n" , mesaiSaat, MesaiUcreti);
        System.out.println("----------------------------------------");
        System.out.printf(" %-23s: %10.2f TL%n%n", "TOPLAM GELIR", toplamGelir);

        System.out.println("KESINTILER:");
        System.out.printf("  SGK Kesintisi (%.1f%%) : %10.2f TL%n", SGK_ORANI * 100, SGKKesinti);
        System.out.printf("  Gelir Vergisi (%.1f%%) : %10.2f TL%n", GELIR_VERGISI_ORANI * 100, GelirVergisi);
        System.out.printf("  Damga Vergisi (%.1f%%)  : %10.2f TL%n", DAMGA_VERGISI_ORANI * 100, DamgaVergisi);
        System.out.println("------------------------------------------");
        System.out.printf(" %-23s: %10.2f TL%n%n", " TOPLAM KESINTI", ToplamKesinti);

        System.out.printf(" %-23s: %10.3f TL%n%n", "NET MAAS", NetMaas);


        System.out.println("ISTATISTIKLER:");
        System.out.printf(" %-23S: %.1f%%%n", "Kesinti Orani", KesintiOrani);
        System.out.printf(" %-22s : %.2f TL/saat%n","Saatlik Net Kazanc", SaatlikNetKazanc);
        System.out.printf(" %-23s: %.2f TL/gun%n", "Gunluk Net Kazanc", gunlukNetKazanc);
        System.out.println("========================================");


    }
}

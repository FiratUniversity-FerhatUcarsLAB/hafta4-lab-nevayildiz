
/*
 * Ad Soyad: Neva Yıldız
 * Ogrenci No: 250541034
 * Tarih: 30.10.2025
 * Acıiklama: Gorev 2 - Geometrik Hesaplayıcı
 *
 * Bu progamın amacı, kullanıcıdan dairenin yarıçapını alarak, bu yarıçapa
 * göre dairenin ve kürenin temel geometrik özelliklerini (alan, çevre, çap,
 * hacim ve yüzey alanı) hesaplayıp ekrana düzenli biçimde yazdırmaktır.
 */


import java.util.Scanner;
public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pi sayısını tanımla
        final double PI = 3.14159;

        System.out.println("=== GEOMETRİK HESAPLAYICI ===");
        System.out.print("Daireinin yarıcapını girin (cm):");

        // Kullancıdan Yarıcap Al
        double r =  input.nextDouble();

        // Matematiksel Hesaplamalar
        double daireAlani = PI * r * r;
        double daireCevresi = 2 * PI * r;
        double daireCapi = 2 * r;
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);
        double kureYuzeyAlanı = 4 *  PI * r * r;

        //Sonucları Yazdır
        System.out.println("\nSONUCLAR  :");
        System.out.println("___________");
        System.out.printf("\nDaire Alanı      : %.2f cm²" , daireAlani);
        System.out.printf("\nDaire Cevresi    : %.2f cm" , daireCevresi);
        System.out.printf("\nDaire Capi       : %.2f cm" , daireCapi);
        System.out.printf("\nKure Hacmi       : %.2f cm³" , kureHacmi);
        System.out.printf("\nKüre Yüzey Alanı : %.2f cm² " , kureYuzeyAlanı);


    }


}

package GrupCalismasi;

import java.util.Scanner;

public class foorLoop {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir başlançı sayısı giriniz");
        int baslangicSayisi = scan.nextInt();
        System.out.println("Lütfen bir bitis sayısı giriniz");
        int bitisSayisi = scan.nextInt();
        int toplamSayi = 0;


        if (baslangicSayisi <= bitisSayisi) {

            for (int i = baslangicSayisi; i <= bitisSayisi; i++) {

                toplamSayi += i;

            }

        } else {
            System.out.println("Geçersiz giriş yapılmıştır");
        }
        System.out.println("Toplam Sonuç :" + " " + toplamSayi);
    }
}


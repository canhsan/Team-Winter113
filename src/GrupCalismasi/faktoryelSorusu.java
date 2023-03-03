package GrupCalismasi;

import java.util.Scanner;

public class faktoryelSorusu {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //       bu sayinin faktoryel degerini hesaplayin.

        Scanner sacn = new Scanner(System.in);

        System.out.println("Lütfen 20’den kucuk bir sayi giriniz");

        int sayi = sacn.nextInt();

        int sayiFaktoryel = 1;

        if (sayi >= 20) {
            System.out.println("Hayırdır arkadaş");

        } else {
            for (int i = sayi; i >= 1; i--) {

                sayiFaktoryel *= i;

            }
            System.out.println(sayiFaktoryel);

        }

    }
}

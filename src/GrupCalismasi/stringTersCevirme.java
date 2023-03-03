package GrupCalismasi;

import java.util.Scanner;

public class stringTersCevirme {
    public static void main(String[] args) {
        //Soru 10 (interview)- Kullanicidan bir String isteyin
        //        ve String’i tersine cevirip kaydedin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime = scan.nextLine();
        String tersKelime = "";

        for (int i = kelime.length() - 1; i >= 0; i--) {
            tersKelime += kelime.charAt(i);

        }

        System.out.println(tersKelime);

    }
}

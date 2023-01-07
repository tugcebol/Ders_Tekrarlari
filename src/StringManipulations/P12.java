package StringManipulations;

import java.util.Scanner;

public class P12 {
    /*
    Kullanicidan isim ve soyismini ayri ayri alin.
    - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        yazdirin
    - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        harflerle yazdirin.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi girin: ");
        String isim = scan.next();
        isim = isim.toLowerCase();
        System.out.println("Lütfen soyisminizi girin: ");
        String soyIsim = scan.next();
        soyIsim = soyIsim.toLowerCase();

        if(isim.length()>soyIsim.length()) {
        System.out.println(isim.substring(0,1).toUpperCase() + isim.substring(1) +
                " " + soyIsim.substring(0,1).toUpperCase() + soyIsim.substring(1));
        }

        else {
            System.out.println(isim.substring(0,1).toUpperCase() + isim.substring(1)
                    + " " + soyIsim.toUpperCase());

        }

    }
}

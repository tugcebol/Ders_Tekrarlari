package StringManipulations;

import java.util.Scanner;

public class P14 {

    public static void main(String[] args) {

        /*
    Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
    duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
    basariyla kaydedildi" yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali
     */


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir şifre girin: ");
        String sifre = scan.next();


        int flag = 0;

        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')) {

            System.out.println("İlk harf küçük olmalı!!!");
            flag++;

        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')) {

            System.out.println("Son karakter rakam olmalı!!!");
            flag++;
        }
        if (sifre.contains(" ")){
            System.out.println("Şifre boşluk içermemeli!!!");
            flag++;
        }
        if (!(sifre.length()>=10)){
            System.out.println("Şifrenin uzunluğu en az 10 karakter olmalı!!!");
            flag++;
        }
        if (flag == 0){
            System.out.println("Şifreniz başarıyla kaydedildi!");
        }

    }
}

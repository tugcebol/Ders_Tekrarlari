package If_Else;

import java.util.Scanner;

public class SifreSorusu {

      /*
    Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
    duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
    basariyla kaydedildi" yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir şifre giriniz: ");
        String sifre = scan.nextLine();

        int flag = 0;

        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            System.out.println("Girilen şifre küçük harf ile başlamıyor!");
            flag++;
        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<= '9')){
            System.out.println("Girilen şifre rakam ile bitmiyor!");
            flag++;
        }
        if ((sifre.contains(" "))) {
            System.out.println("Şifre boşluk içermemeli!");
            flag++;
        }
        if (sifre.length() <10) {
            System.out.println("Şifre 10 karakterden kısa olmamalı!");
            flag++;
        }

        if (flag == 0) {
            System.out.println("Şifreniz başarıyla oluşturuldu.");
        }


    }
}

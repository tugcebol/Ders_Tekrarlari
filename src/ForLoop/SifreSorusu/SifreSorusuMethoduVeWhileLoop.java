package ForLoop.SifreSorusu;

import java.util.Scanner;

public class SifreSorusuMethoduVeWhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean tekrarSifreIste = true;
        String sifre = "";


        while (tekrarSifreIste){
            System.out.println("Lütfen şifrenizi girin: ");
            sifre = scan.nextLine();

            if (sifreKontrol(sifre)){
                System.out.println("Şifreniz başarıyla oluşturuldu!");
                tekrarSifreIste = false;
            }
        }


    }
    public static boolean sifreKontrol (String sifre){

        int flag = 0;

        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            System.out.println("Şifre küçük harfi ile başlamalı!");
            flag++;
        }
        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            System.out.println("Şifre rakam ile bitmeli!");
            flag++;
        }
        if (sifre.contains(" ")) {
            System.out.println("Şifre boşluk içermemeli!");
            flag++;
        }
        if (sifre.length() - 1 < 10) {
            System.out.println("Şifre 10 karakterden küçük olamaz!");
            flag++;
        }

        if (flag == 0) {
            return true;
        } else {
            return false;
        }

    }

}


package ForLoop.AsalSayi;

import java.util.Scanner;

public class Yontem_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin: ");
        int sayi = scan.nextInt();

        String sonuc = "Girilen sayı asal sayıdır.";

        for (int i = 2; i <sayi ; i++) {
            if (sayi % i == 0 ){
                sonuc = "Girilen sayı asal sayı değildir.";
                break;
            }
        }

        System.out.println(sonuc);
    }
}

package ForLoop.AsalSayi;

import java.util.Scanner;

public class Yontem_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin: ");
        int sayi = scan.nextInt();

        int sayac = 1;

        for (int i = 2; i <sayi ; i++) {
            if (sayi % i == 0){
                sayac++;
            }
        }

        System.out.println(sayac == 1
                ?
                "Girdiğiniz sayı asal sayıdır."
                :
                "Girdiğiniz sayı asal sayı değildir.");
    }

}

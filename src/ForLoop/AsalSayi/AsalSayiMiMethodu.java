package ForLoop.AsalSayi;

import java.util.Scanner;

public class AsalSayiMiMethodu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen asal olup olmadığını öğrenmek istediğiniz sayıyı giriniz: ");
        int sayi = scan.nextInt();
        
        asalSayiMi(sayi);

    }

    public static boolean asalSayiMi (int sayi){

        boolean asalSayiMi = true;

        for (int i = 2; i <sayi ; i++) {
            if (sayi % i == 0){
                asalSayiMi = false;
                break;
            }

        }

        System.out.println(asalSayiMi ? "Girilen sayı asal sayıdır" : "Girilen sayı asal sayı değil.");

        return asalSayiMi;
    }
}

package TernaryOperator;

import java.util.Scanner;

public class P03 {

    /*
    Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
    “Sayi 5’in tam kati” yazdirin.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi girin: ");
        int sayi = scan.nextInt();

        System.out.println(sayi%5==0 ? "Sayı 5'in katı." : "Sayı 5'in katı değil." );


    }
}

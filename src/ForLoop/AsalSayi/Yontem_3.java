package ForLoop.AsalSayi;

import java.util.Scanner;

public class Yontem_3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin: ");
        int sayi = scan.nextInt();

        boolean asalSayi = true;

        for (int i = 2; i <sayi ; i++) {
            if(sayi % i == 0){
                asalSayi = false;
                break;
            }
        }

        System.out.println(asalSayi
                ?
                "Girilen sayı asal sayıdır."
                :
                "Girilen sayı asal sayı değildir.");
    }
}

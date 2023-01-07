package TernaryOperator;

import java.util.Scanner;

public class P09_NestedTernary {
     //Kullanicidan bir tamsayi alin.
    //Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani
    //yazdirin
    //Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
    //uygun olani yazdirin

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Sayı gir: ");
        int sayi = scan.nextInt();

        System.out.println(sayi > 0
                ?
                (sayi % 2 == 0 ? "çift sayı" : "tek sayı")
                :
                (sayi <= -100 && sayi >= -999 ? "üç basamaklı" : "3 basamaklı değil"));

    }
}

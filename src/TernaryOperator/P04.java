package TernaryOperator;

import java.util.Scanner;

public class P04 {
    // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
    //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluklarını girin: ");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        System.out.println(kenar1 == kenar2 && kenar1 == kenar3 ? "Eşkenar üçgen." : "Eşkenar üçgen değil.");



    }
}

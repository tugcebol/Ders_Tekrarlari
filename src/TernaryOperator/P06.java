package TernaryOperator;

import java.util.Scanner;

public class P06 {
    //Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
    //kucukse “Maalesef kaldin” yazdirin.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Not gir:");
        int not = scan.nextInt();

        System.out.println(not>=50 && not<=100 ? "Sınıfı geçtin" : "Malesef kaldın");

    }
}

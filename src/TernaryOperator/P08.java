package TernaryOperator;

import java.util.Scanner;

public class P08 {

    // Kullanicidan bir sayi alin ve mutlak degerini yazdirin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı gir");
        int a = scan.nextInt();

        System.out.println(a<0 ? -1*(a) : a);


    }

}

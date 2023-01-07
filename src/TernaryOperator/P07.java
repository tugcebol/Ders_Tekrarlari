package TernaryOperator;

import java.util.Scanner;

public class P07 {
    // Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayı gir: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a>b ? b : a);
    }
}

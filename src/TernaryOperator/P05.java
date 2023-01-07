package TernaryOperator;

import java.util.Scanner;

public class P05 {
    //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
    //harf olarak yazdirin, yoksa girilen harfi yazdirin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf girin: ");
        char harf = scan.next().charAt(0);


        System.out.println(harf>='a' && harf<='z' ? (char)(harf-32) : harf);
    }
}

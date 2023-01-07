package ForLoop;

import java.util.Scanner;

public class TersiniYazdir {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String cumle = scan.nextLine();

        int index = cumle.length()-1;
        String tersCumle = "";


        for (int i = index; i >=0 ; i--) {
          tersCumle += cumle.substring(i,i+1);
        }

        System.out.println("Girilen cümlenin tersten yazılışı: " + tersCumle);
    }
}

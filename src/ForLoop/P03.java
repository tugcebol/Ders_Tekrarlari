package ForLoop;

import java.util.Scanner;

public class P03 {

    public static void main(String[] args) {

        // Kullanıcıdan başlangıç ve bitiş değerlerini alıp bu sınırlar dahil olarak,
        // bu sayılar arasında 5'in katı olan sayıları yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen başlangıç ve bitiş değerlerini girin: ");
        int bas = scan.nextInt();
        int bit = scan.nextInt();

        for (int i = bas; i<=bit; i++) {

            if (i%5==0) System.out.print(i + " ");
        }
        
    }
}

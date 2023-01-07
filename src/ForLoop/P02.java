package ForLoop;

public class P02 {

    public static void main(String[] args) {

        // 1 ile 1000 arasındaki sayıları yanyana yazdırın.
        // Yazdırma işlemi bittiğinde "tüm bu sayıların toplamı = " deyio sayıların toplamını yazdırın.

        int i;
        int toplam = 0;

        for (i=1; i<=1000 ; i++) {
            System.out.print(i + " ");
           // toplam = toplam + i; // bu yazımı tercih etmiyoruz
            toplam += i;

        }
        System.out.println("Sayıların toplamı: " + toplam);


    }
}

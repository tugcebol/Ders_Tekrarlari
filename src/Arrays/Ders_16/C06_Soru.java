package Arrays.Ders_16;

public class C06_Soru {

    /* Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        method yaziniz. */
    public static void main(String[] args) {

        int [] sayilar = {3, 7, 1, 9, -3, -11, -50};

        System.out.println(sayilariTopla(sayilar));

    }

    public static int sayilariTopla (int[]arr){

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > 0){

                toplam += arr[i];
            }

        }
        return toplam;
    }
}

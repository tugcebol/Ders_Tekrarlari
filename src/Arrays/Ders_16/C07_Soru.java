package Arrays.Ders_16;

public class C07_Soru {

    // Bir marketin fiyatlarını tutan bir array var. Bu marketteki en yüksek ve
    // en düşük fiyatları yazdıran bir method oluşturun.

    public static void main(String[] args) {

        double [] fiyatlar = {23, 34.5, 42.1, 5.7, 3.4, 23.5};

        enYuksekEnDusukFiyatYazdir(fiyatlar);

    }

    public static void enYuksekEnDusukFiyatYazdir (double[]arr){

        double enDusukFiyat = arr[0];
        double enYuksekFiyat = arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if (enDusukFiyat>arr[i]) {
                enDusukFiyat = arr[i];

            }
            if (enYuksekFiyat<arr[i]){
                enYuksekFiyat = arr[i];
            }

        }

        System.out.println("En düşük fiyat: " + enDusukFiyat + "\n" + "En yüksek fiyat: " + enYuksekFiyat);




    }
}

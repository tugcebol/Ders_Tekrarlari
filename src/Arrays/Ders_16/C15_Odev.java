package Arrays.Ders_16;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class C15_Odev {

    /*
    Kullanıcıdan yeni isimler alıp var olan bir array'e ekleyen bir method oluşturun.
    Kullanıcı yeni değer verdiği müddetçe C14deki method ile eklemeye devam edin.
    Kullanıcı Q'ya bastığında arrayin son halini döndürün.
     */

    public static void main(String[] args) {

        String [] isimler = new String[0];
        String isim = "";

        isimler = isimEklemece(isimler,isim);
        System.out.println(Arrays.toString(isimler));


    }

    public static String [] isimEklemece (String[]array, String isim) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen eklemek istediğiniz ismi girin: ");


        String[] temp = new String[0];
        while (!(isim == "Q")) {

            String eklenecekIsim = scan.nextLine();
            temp = new String[array.length + 1];

            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            temp[temp.length - 1] = eklenecekIsim;

        }

        return temp;


    }




    }





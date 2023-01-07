package Arrays.Ders_16;

import java.util.Arrays;

public class C04_Soru {

    // Verilen bir String arrayde istenen bir harfi içeren kelimeleri silip,
    // yerine null yazdırın.

    public static void main(String[] args) {

        String [] isimler = {"Hüseyin","Yusuf","Mehmet","Akile","Said"};
        String silinecekHarf = "e";

        for (int i = 0; i <isimler.length ; i++) {

            if(isimler[i].contains(silinecekHarf)){
                isimler[i] = null;
            }
        }

        System.out.println(Arrays.toString(isimler)); // [null, Yusuf, null, null, Said]


    }
}

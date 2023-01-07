package Arrays.Ders_16;

import java.util.Arrays;

public class C12_Soru {

    /*
    Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
    basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        Örn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
     */

    public static void main(String[] args) {

        int [] arr = {4, 5, 6, 7};

        arr = elemanKaydirma(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] elemanKaydirma (int[]array){

        int bosKova = 0;

        bosKova =array[array.length-1];

        for (int i = array.length-1; i > 0 ; i--) {
            array[i] = array[i-1];
        }

        array[0] = bosKova;


        return array;
    }

}

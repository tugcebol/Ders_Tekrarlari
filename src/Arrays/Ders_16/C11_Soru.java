package Arrays.Ders_16;

import java.util.Arrays;

public class C11_Soru {

    /*
     Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
     eski array’e yeni degeri atayin
     */

    public static void main(String[] args) {

        int[] abc= {3,5,8,9,6,7,3,4};
        int eklenecekSayi=10;

        abc = arrayeElemanEkle(abc,eklenecekSayi);
        System.out.println(Arrays.toString(abc)); // [3, 5, 8, 9, 6, 7, 3, 4, 10]

    }

    public static int[] arrayeElemanEkle(int [] eklenecekArray, int eklenecekSayi ){

        int[] yeniArray = new int [eklenecekArray.length+1];

        for (int i = 0; i <eklenecekArray.length ; i++) {

            yeniArray [i] = eklenecekArray[i];
            
        }

        yeniArray[yeniArray.length-1] = eklenecekSayi;

        return yeniArray;

    }

}
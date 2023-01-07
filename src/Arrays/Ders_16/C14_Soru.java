package Arrays.Ders_16;

import java.util.Arrays;

public class C14_Soru {

    /*
     Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
     eski array’e yeni degeri atayin.
     */

    public static void main(String[] args) {

        String [] isimler = {"Ali", "Veli", "Mehmet"};
        String eklenecekIsim = "Kemal";

        isimler = elemanEkleme(isimler,eklenecekIsim);

        System.out.println(Arrays.toString(isimler)); // [Ali, Veli, Mehmet, Kemal]
    }

    public static String[] elemanEkleme (String[]arr, String eklenecekEleman){

        String[] temp = new String[arr.length+1];

        for (int i = 0; i < arr.length; i++) {

            temp[i] = arr[i];
        }

        temp[temp.length-1] = eklenecekEleman;

        return temp;
    }

}

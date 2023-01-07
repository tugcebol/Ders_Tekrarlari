package Arrays.Ders_16;

import java.util.Arrays;

public class C16_sort {

    // Verilen bir array'i natural ordera göre sıralayıp yazdırın.

    public static void main(String[] args) {

        String [] isimler = {"Hüseyin", "Yusuf", "Mehmet", "Akile", "Said", "ahmet", "Mehmet", "adnan"};

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler)); // [Akile, Hüseyin, Mehmet, Mehmet, Said, Yusuf, adnan, ahmet]


        // SORU: Eğer büyükten küçüğe sıralamak istersek, önce sort kullanarak natural ordera göre sıralayıp,
        // sonra geçici bir array kullanarak sıralamayı ters çeviririz. 

        String [] temp = new String[isimler.length];


        for (int i = 0; i < isimler.length; i++) {
                temp[isimler.length-i-1] = isimler[i];
        }

        System.out.println(Arrays.toString(temp));


    }


}

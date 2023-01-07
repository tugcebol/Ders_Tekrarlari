package Arrays.Ders_16;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_Soru {

    // Verilen bir int arraydeki tüm elamanların değerlerini 5 arttırın.

    public static void main(String[] args) {

        int [] arr = {2,4,6,8};

        for (int i = 0; i <arr.length ; i++) {

            arr[i] +=5;

        }

        System.out.println(Arrays.toString(arr)); // [7, 9, 11, 13]
    }
}

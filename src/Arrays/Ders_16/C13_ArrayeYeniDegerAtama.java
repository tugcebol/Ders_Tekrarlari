package Arrays.Ders_16;

import java.util.Arrays;

public class C13_ArrayeYeniDegerAtama {

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3};

        //arr1 = {1,3,4};
        //arr1 = {1,2,3,4}

        //arr1 = new int[5];

        System.out.println(Arrays.toString(arr1)); // [0, 0, 0, 0, 0]

        // 15. satırdaki atama ile Java, arr1in pointerını eski arrayden silip,
        // new keywordu ile oluşturduğumuz yeni arraye yönlendirir.

        // Eski elementleri de korumak istersek ne yapmalıyız?

        // O zaman atama yapmadan önce yeni arrayi hazırlamalıyız, bunun için boş bir yeni array oluşturup, eski
        // arraydeki elementleri yeni arraye taşıyıp sonra atama yapabiliriz

        int [] temp = new int[5];

        for (int i = 0; i <arr1.length ; i++) {

            temp[i] = arr1[i];

        }

        System.out.println(Arrays.toString(arr1)); // [1, 2, 3]
        System.out.println(Arrays.toString(temp)); // [1, 2, 3, 0, 0]

        arr1 = temp;

        System.out.println(Arrays.toString(arr1)); // [1, 2, 3, 0, 0]
        System.out.println(Arrays.toString(temp)); // [1, 2, 3, 0, 0]



    }
}

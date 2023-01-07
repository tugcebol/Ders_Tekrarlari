package Arrays.Ders_16;

import java.util.Arrays;

public class C17_binarySearch {

    public static void main(String[] args) {

        // Binary tree javanın kullandığı özel bir sıralama yöntemidir.

        // binarySearch methodu binary tree özelliğini kullandığından sıralı olmayan arraylerde,
        // doğru sonuç döndürmeyebilir.

        // Eğer binarySearch kullanılacaksa öncesinde mutlaka sort kullanılmalıdır.

        int [] arr = {2, 6, 9, 3, 15, 1, 7};

        System.out.println(Arrays.binarySearch(arr, 1));  // -1
        System.out.println(Arrays.binarySearch(arr, 15)); // -8
        System.out.println(Arrays.binarySearch(arr, 3));  // 3
        System.out.println(Arrays.binarySearch(arr, 2));  // 0

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 6, 7, 9, 15]

        System.out.println(Arrays.binarySearch(arr, 3)); // 2
        System.out.println(Arrays.binarySearch(arr, 15)); // 6


    }
}

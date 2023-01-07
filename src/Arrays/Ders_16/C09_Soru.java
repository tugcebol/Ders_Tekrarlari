package Arrays.Ders_16;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C09_Soru {
    /*
    Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
    donduren bir method olusturun
     */

    public static void main(String[] args) {

       int [] arr =  arrayOlustur();

        System.out.println(Arrays.toString(arr));

    }

    public static int[] arrayOlustur (){

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen arrayin boyutunu giriniz: ");
        int boyut = scan.nextInt();

        int [] yeniArray = new  int [boyut];

        for (int i = 0; i < boyut; i++) {
            System.out.println("Lütfen bir element girin: ");

            yeniArray[i] = scan.nextInt();
        }

        return yeniArray;

    }

    /*
    public static void main(String[] args) {
		// Kullanicidan degerler alarak int bir array olusturun
		// once kullanicidan girecegi sayi adedini almamiz lazim ki array'i olusturalim

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen kac sayidan olusan bir array istediginizi yaziniz");
		int uzunluk=scan.nextInt();

		int arr[]= new int[uzunluk]; // 5

		System.out.println("Lutfen sayilari griniz");
		for (int i = 0; i < arr.length; i++) {
		   arr[i]= scan.nextInt();

		}

		System.out.println(Arrays.toString(arr));

	}
     */
}

package Arrays.Ders_16;

public class C10_Soru {
    /*
    Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
    olusturun.
     */

    public static void main(String[] args) {

        String [] arr = {"bugün", "hava", "çok", "rüzgarlı", "makas", "ay", "sonbahar", "lambader", "kütüphaneci"};

        enUzunEnKisa(arr);
    }

    public static void enUzunEnKisa (String [] arr){

        String enUzun = arr[0];
        String enKisa = arr[0];

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].length()>enUzun.length()){
                enUzun = arr[i];
            }

            if (arr[i].length()<enKisa.length()){
                enKisa = arr[i];
            }

        }

        System.out.println("En uzun element: " + enUzun + "\n" + "En kısa element: " + enKisa);


    }
}

package StringManipulations;

public class P13 {
    /*
        Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        yazdirin.
     */

    public static void main(String[] args) {
        String str = "buse";

        int a = str.length();
        int b = str.length()/2; //stringin ortası = b'inci index

        if (a%2==0) {
            System.out.println(str.substring(0,b) + ":)" + str.substring(b));
        }
        else {
            System.out.println(str.substring(0,b) + ":(" + str.substring(b+1));
        }

    }
}

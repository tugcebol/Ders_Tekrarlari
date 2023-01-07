package ForLoop;

public class P05 {

    // input olarak verilen bir tamsayının asal sayı olup olmadığını yazdırın.

    public static void main(String[] args) {

        int input = 21;
        String sonuc = "Sayı asal sayıdır.";

        for (int i = 2; i <input ; i++) {
            if (input%i==0){
                sonuc = "Sayı asal değildir.";
                break; // Java bir loopun içerisinde break görürse o loopu bitirir.
            }

        }
        System.out.println(sonuc);

    }
}

package StringManipulations;

public class P02 {
    public static void main(String[] args) {

        String str1 = "Pazar";
        String str2 = "PAZAR";
        String str3 = "pazar";
        String str4 = "PaZaR";

        System.out.println(str1.equals(str2)); // false

        System.out.println(str1.equalsIgnoreCase(str3)); //true --> equalsIgnoreCase() methodu ile büyük
                                                         // küçük harf duyarlılığı geçersiz oluyor.

    }
}

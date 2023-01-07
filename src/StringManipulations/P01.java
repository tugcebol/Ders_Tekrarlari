package StringManipulations;

public class P01 {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java"); // String non-primitive olduğundan aslında Scanner yazar gibi
                                                 // yazmaylız new String(); gibi ama Java işimizi kolaylaştırıyor
                                                 // ve String'e primitive gibi değer atayabiliyoruz.
        String str4 = "Ja";
        String str5 = str4.concat("va");

        System.out.println(str1==str2); // true
        System.out.println(str1==str3); // false
        System.out.println(str1==str5); // false

        // == yerine methodlardan equals() kullanmalıyız.

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str5)); // true

    }
}

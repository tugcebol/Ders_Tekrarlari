package StringManipulations;

public class P11 {
    /*
    Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
    sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
    input : java1 ogRe2@nMek3 #ne +Gu=zel
    output : Java ogrenmek ne guzel.
     */

    public static void main(String[] args) {
        String input = "java1 ogRe2@nMek3 #ne +Gu=zel";
        String calisilacakInput = input.toLowerCase();

        calisilacakInput = calisilacakInput.replace(" ", "t");
        calisilacakInput = calisilacakInput.replaceAll("\\W", "");
        calisilacakInput= calisilacakInput.replaceAll("\\d", "");
        calisilacakInput = calisilacakInput.replace("t", " ");
        calisilacakInput = calisilacakInput.replaceFirst("j", "J");

        System.out.println(calisilacakInput); // Java ogrenmek ne guzel
    }
}

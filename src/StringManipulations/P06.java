package StringManipulations;

public class P06 {

    // Kullanıcıdan aldığımız cümle "çok" ile başlayan ilk kelimeyi yazdırın.
    // Cümlede çok kelimesi yok ise "cümlede çok ile başlayan kelime yok" yazsın.
    public static void main(String[] args) {
        String cumle = "Bu kadar çoklu seçenek olur mu";
        if (!cumle.contains("çok")) System.out.println("cümlede çok ile başlayan kelime yok");


        else {
            int cokIndexi = cumle.indexOf("çok");
            int boslukIndexi = cumle.indexOf(" ",cokIndexi+1);

            System.out.println(cumle.substring(cokIndexi, boslukIndexi));
        }


    }


}

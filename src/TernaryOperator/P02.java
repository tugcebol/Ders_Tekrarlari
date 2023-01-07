package TernaryOperator;

public class P02 {

    // Kullanıcıdan alınan değer
    // 100'den büyükse sayıyı 2 ile çarpın.
    // 100'den küçükse sayıya 10 ekleyin.

    public static void main(String[] args) {

        int input = 145;

        System.out.println(input>100 ? input*2 : input+10);

        input = input>100 ? input*2 : input+10;
        System.out.println(input);


        /* Verilen inputu inceleyin.
        eğer 100'den büyükse bunu 5'e bölüp, bölüm sonucunun tek sayı olup olmadığını kontrol edin.
        eğer 100'den büyük değilse, 10 ile bölümünden kalanı bulup, bu kalanı 5 arttırın.

        Bu tür kompleks işlemleri Ternaty ile YAPMAYIZ.
     */
    }
}

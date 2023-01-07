package StringManipulations;

public class P05 {
    public static void main(String[] args) {

        String str = "Java ile kodlama çok kolay";

        // ikinci o'nun indeksini bulalım.

        int ilkO = str.indexOf("o"); //10
        int ikinciO = str.indexOf("o",11);

        System.out.println(ilkO + " " + ikinciO);




    }
}

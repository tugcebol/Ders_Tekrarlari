package StringManipulations;

public class P03 {
    public static void main(String[] args) {

        String str = "Java güzeldir";
        int krk= str.length();
        System.out.println(krk);
        // J --> 0.index
        // r --> 12. index
        System.out.println(str.charAt(str.length() - 2));


    }
}

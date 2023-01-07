package StringManipulations;

public class P10 {
    /*
    Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        input1 : “15.30 €” , input2 : “11.40 €”
        output : 26.70 €
     */

    public static void main(String[] args) {

        String input1 = "15.30 €";
        String input2 = "11.40 €";

        input1 = input1.replace(".", "6");
        input2 = input2.replace(".", "6");

        input1 = input1.replaceAll("\\D", "");
        input2 = input2.replaceAll("\\D", "");


        input1 = input1.replace("6", ".");
        input2 = input2.replace("6", ".");

        double input1D = Double.parseDouble(input1);
        double input2D = Double.parseDouble(input2);

        System.out.println(input1D+input2D + " €");  // 26.700000000000003 €


    }
}

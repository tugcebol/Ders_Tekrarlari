package StringManipulations;

public class P07 {


    // sonucun 50 den fazla olduğunu yazdır.
    public static void main(String[] args) {


    String input = "1-48 of 87 results for \"nutella\"";

        int of = input.indexOf("of");  // 5
        int result = input.indexOf("result");


        String sonucString = input.substring(of+3, result-1);
        int sonucInt = Integer.parseInt(sonucString);

        System.out.println(sonucInt>50 ? "Test PASSED" : "Test FAILED");


        int ilkBosluk = input.indexOf(" ");
        int ikinciBosluk = input.indexOf(" ", ilkBosluk+1);
        int ucuncuBosluk = input.indexOf(" ", ikinciBosluk+1);

        System.out.println(input.substring(ikinciBosluk + 1, ucuncuBosluk));

        String str = input.substring(ikinciBosluk+1,ucuncuBosluk-1);



    }
}
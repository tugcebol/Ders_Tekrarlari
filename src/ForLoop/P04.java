package ForLoop;

public class P04 {

    // Input olarak verilen bir Stringde;
    // indexi tek sayı olanları küçük harfle
    // indexi çift sayı olanları büyük harfle yazdırın.
    // örnek --> input: java output: JaVa

    public static void main(String[] args) {


        String input = "java da java";
        int uzunluk = input.length()-1;



        for (int i = 0; i <=uzunluk ; i++) {

            if (i%2==0){
                System.out.print(input.substring(i,i+1).toUpperCase());
            }
            else {
                System.out.print(input.substring(i, i + 1).toLowerCase());
            }

        }
    }
}

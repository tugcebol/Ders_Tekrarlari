package StringManipulations;

public class P08 {
    public static void main(String[] args) {

        String str = "Evden calisiyorum, ise gitmeye gerek yok";
        String cumle = str.toLowerCase();



        if (cumle.contains("ev") && cumle.contains("is")){
            System.out.println("Hem ev lazım hem iş");
        }
        else if (cumle.contains("is")) {
            System.out.println("Çalışmak güzeldir.");
        }
        else if (cumle.contains("ev")) {
            System.out.println("Home sweet home.");
        }
        else {
            System.out.println("Çok çalışman lazım.");
        }

    }
}

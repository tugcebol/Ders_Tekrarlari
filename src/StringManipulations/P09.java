package StringManipulations;

import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("cümle alayım:");
        String cumle = scan.nextLine().toLowerCase();

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

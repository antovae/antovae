package BasicSyntax;

import java.util.Scanner;

public class e11RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gameLost = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        int headsetCount = gameLost / 2;
        int mouseCount = gameLost / 3;
        int keyboardCount = gameLost / 6;
        int displayCount = gameLost / 12;

        double totalSum = (headsetCount * headsetPrice) + (mouseCount * mousePrice) + (keyboardCount * keyboardPrice) + (displayCount * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalSum);


    }
}

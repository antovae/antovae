package BasicSyntax;

import java.util.Scanner;

public class p10MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d X %d = %d%n", num, i, num * i );
        }
    }
}

package BasicSyntax;

import java.util.Scanner;

public class p11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        int times = Integer.parseInt(sc.nextLine());

        if (times > 10) {
            System.out.printf("%d X %d = %d%n", num, times, times * num);
        } else {
            for (int i = times; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", num, i, i * num);
            }
        }
    }
}

package BasicSyntax;

import java.util.Scanner;

public class p04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = Integer.parseInt(sc.nextLine());
        int min = Integer.parseInt(sc.nextLine());

        int allMin = (hour * 60 + min + 30);

        int lastHour = allMin / 60;
        int lastMin = allMin % 60;

        if (lastHour > 23) {
            lastHour = 0;
        }

        System.out.printf("%d:%02d", lastHour, lastMin);
    }
}

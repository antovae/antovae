package DataTypesandVariables;

import java.util.Scanner;

public class p01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int meters = Integer.parseInt(sc.nextLine());
        double km = meters / 1000.0;

        System.out.printf("%.2f",km);
    }
}

package BasicSyntax;

import java.util.Scanner;

public class p02Passed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = Double.parseDouble(sc.nextLine());

        if (grade >= 3.00 ) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}

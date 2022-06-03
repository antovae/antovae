package DataTypesandVariables;

import java.util.Scanner;

public class p05ConcatNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nameOne = sc.nextLine();
        String nameTwo = sc.nextLine();
        String delimeter = sc.nextLine();

        System.out.println(nameOne + delimeter + nameTwo);
    }
}

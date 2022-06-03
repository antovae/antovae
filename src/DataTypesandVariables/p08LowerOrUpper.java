package DataTypesandVariables;

import java.util.Scanner;

public class p08LowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letters = sc.nextLine().charAt(0);

        if (letters >= 'a' && letters <= 'z'){
            System.out.println("lower-case");
        } else if ( letters >= 'A' && letters <= 'Z'){
            System.out.println("upper-case");
        }
    }
}

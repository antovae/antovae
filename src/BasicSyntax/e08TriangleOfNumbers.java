package BasicSyntax;

import java.util.Scanner;

public class e08TriangleOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        for (int row = 1; row <= num; row++) {
            for (int count = 1; count <= row; count++) {
                System.out.print(row + " ");
            }
            System.out.println("");
        }
    }
}

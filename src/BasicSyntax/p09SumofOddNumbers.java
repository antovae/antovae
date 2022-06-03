package BasicSyntax;

import java.util.Scanner;

public class p09SumofOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = 1; i <= n * 2; i++) {

            if (i % 2 !=0) {
                sum += i;
                System.out.println(i);
            }

        }
        System.out.println("Sum: " + sum);
    }
}

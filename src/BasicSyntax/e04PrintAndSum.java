package BasicSyntax;

import java.util.Scanner;

public class e04PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startNum = Integer.parseInt(sc.nextLine());
        int endNum = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int number = startNum; number <= endNum; number++) {
            System.out.print(number + " ");
            sum += number;

        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}

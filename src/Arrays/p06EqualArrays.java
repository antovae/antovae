package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p06EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        boolean areNotIdentical = false;
        for (int i = 0; i < firstArr.length; i++) {
            sum += firstArr[i];

            if (firstArr[i] != secondArr[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areNotIdentical = true;
                break;
            }
        }
        if (!areNotIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}

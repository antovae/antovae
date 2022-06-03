package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String lineInput = sc.nextLine();

        int[] numbersArr = Arrays
                .stream(lineInput.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i < numbersArr.length ; i++) {
            int currentNum = numbersArr[i];
            if(currentNum % 2 == 0){
                sum += currentNum;
            }
        }

        System.out.println(sum);
    }
}

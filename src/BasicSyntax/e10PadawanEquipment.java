package BasicSyntax;

import java.util.Scanner;

public class e10PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int  studentsCount = Integer.parseInt(sc.nextLine());
        double priceLight = Double.parseDouble(sc.nextLine());
        double priceRobe = Double.parseDouble(sc.nextLine());
        double priceBelt = Double.parseDouble(sc.nextLine());

        double sumLight = Math.ceil(studentsCount + 0.10 * studentsCount) * priceLight;
        double sumRobes = studentsCount * priceRobe;
        double sumBelts = (studentsCount - studentsCount / 6) * priceBelt;

        double totalSum = sumLight + sumRobes + sumBelts;

        if(totalSum <= budget){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            double neededMoney = totalSum - budget;
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        }
        }
    }
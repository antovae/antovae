package BasicSyntax;

import java.util.Scanner;

public class p06ForeignLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String county = sc.nextLine();

        switch (county) {
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}

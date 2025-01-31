package app;

import java.util.Scanner;

public class Main {

    private static final double CONVERT_KG = 2.20462;

    public static void main(String[] args) {
        System.out.println("App for measures converting.");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount of weight in kilograms: ");
        double kgs = scan.nextDouble();
        double pounds = convertKgsToPounds(kgs);
        System.out.printf("%nResult is %.2f pounds", pounds);
    }

    private static double convertKgsToPounds(double kgs) {
        return kgs * CONVERT_KG;
    }
}

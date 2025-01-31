package app;

import java.util.Scanner;

public class Main {

    private static final double CONVERT_KG = 2.20462;

    public static void main(String[] args) {
        System.out.println("Converter App.");
        System.out.println("Version 1.0.");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount of weight in kilograms: ");
        double kgs = scan.nextDouble();
        System.out.print("Enter amount of weight in pounds: ");
        double pnds = scan.nextDouble();
        double pounds = convertKgsToPounds(kgs);
        double kilos = convertPoundsToKgs(pnds);
        System.out.printf("%nResult is %.2f pounds and %.2f kilograms.",
                pounds, kilos);
    }

    private static double convertKgsToPounds(double kgs) {
        return kgs * CONVERT_KG;
    }

    private static double convertPoundsToKgs(double pnds) {
        return pnds / CONVERT_KG;
    }
}

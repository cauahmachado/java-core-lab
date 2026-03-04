package fundamentals.logic;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the travel time (in hours):");
        double travelTime = scan.nextDouble();
        System.out.println("Enter the average speed (km/h):");
        double averageSpeed = scan.nextDouble();
        double distance = travelTime * averageSpeed;
        double fuelUsed = distance / 12;
        System.out.printf("Distance traveled: %.2f km%n", distance);
        System.out.printf("Fuel used: %.2f liters%n", fuelUsed);

        scan.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Take input for total number of days
        System.out.print("Enter total number of days: ");
        int numDays = scanner.nextInt();

        // Initialize array of size numDays
        double[] temperatures = new double[numDays];
        double totalSum = 0;

        // 2. Prompt user to enter all temperature values
        System.out.println("\nEnter the temperature for " + numDays + " days:");
        for (int i = 0; i < numDays; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temperatures[i] = scanner.nextDouble();
            totalSum += temperatures[i];
        }

        // 3. Calculate average
        double average = totalSum / numDays;
        System.out.printf("\nAverage temperature = %.2f\n", average);

        // 4. Count how many days are above average
        int countAboveAverage = 0;
        for (double temp : temperatures) {
            if (temp > average) {
                countAboveAverage++;
            }
        }

        System.out.println(countAboveAverage + " day(s) above average");
        scanner.close();
    }
}
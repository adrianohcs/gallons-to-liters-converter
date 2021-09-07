package unitconverter;

public class GallonToLiter {
    public static void main(String[] args) {
        double gallons, liters;
        int count = 0;

        // 1 liter equals 3.7854 gallons
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(String.format("%.2f", gallons) + " gallons equals " + String.format("%.2f", liters) + " liters.");

            // Adding a line counter
            count++;

            // Every 10th line, output a blank line
            if (count == 10) {
                System.out.println();
                // Reset the line counter
                count = 0;
            }
        }
    }
}

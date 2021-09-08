package unitconverter;

public class GallonToLiter {
    public static void main(String[] args) {
        double gallons, liters;
        int count = 0;

        // 1 liter equals 3.7854 gallons
        System.out.println("GALLONS\t\t\t\tLITERS");
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(String.format("%.2f", gallons) + "\t\t\t\t" + String.format("%.2f", liters));

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

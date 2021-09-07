package unitconverter;

public class GallonToLiter {
    public static void main(String[] args) {
        double gallons, liters;
        int count = 0;

        // 1 liter equals 3.7854 gallons.
        for (gallons = 1; gallons <= 20; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons equals " + liters + " liters.");

            // Adding a line counter
            count++;
            System.out.println("LOOP ITERATION: " + count);
            System.out.println();
        }
    }
}

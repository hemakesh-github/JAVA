import java.util.Random;

class DiceRoll {
    int[] dcount = new int[6];//Array to store counts for each double

    int[] doublesCount() {
        for (int i = 0; i < 10000; i++) {
            Random rand = new Random();
            int d1 = rand.nextInt(6) +1; //Roll the first die
            int d2 = rand.nextInt(6) +1; //Roll the second die

            if (d1 == d2) {
                dcount[d1 - 1]++; // Increment the double count of the corresponding value out of 1 to 6
            }
        }
        return dcount;
    }

}

public class DiceRollDemo {
    public static void main(String[] args) {
        DiceRoll ob = new DiceRoll();

        int[] count = ob.doublesCount();
        // Print the results
        System.out.println("Number of doubles rolled for each different pair of doubles");

        for (int i = 0; i < 6; i++) {
            System.out.println("Double " + (i + 1) + ": " + count[i]);
        }
    }
}

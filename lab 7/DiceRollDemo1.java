import java.util.Random;
import java.util.Scanner;
class DiceRoll {
    
    int arr[] = new int[6]; //Array to store counts for each double
    public void doublesCount(int n) {
        Random rand = new Random(1000);
        for (int i = 0; i < n; i++) {
            int n1 = rand.nextInt(6) + 1;
            int n2 = rand.nextInt(6) + 1;
            if (n1 == n2) {
                arr[n1 - 1]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println((i + 1) + "-" + (i + 1) + ": " + arr[i]);
            }
        }
       
    }
}

class DiceRollDemo1 {
    public static void main(String[] args) {
        DiceRoll d = new DiceRoll();
        System.out.println("n = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        d.doublesCount(n);
    }
}
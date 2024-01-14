import java.util.Scanner;
public class ElectricityBillGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Consumer Number: ");
        int consumerNumber = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        int prevMonthReading = scanner.nextInt();

        System.out.print("Enter Current Month Reading: ");
        int currMonthReading = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Type of EB Connection (domestic/commercial): ");
        String ebConnectionType = scanner.nextLine();

        scanner.close();

        int unitsConsumed = currMonthReading - prevMonthReading;
        double billAmount = calculateBillAmount(unitsConsumed, ebConnectionType);

        System.out.println("Electricity Bill Details:");
        System.out.println("Consumer Number: " + consumerNumber);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Type of EB Connection: " + ebConnectionType);
        System.out.println("Bill Amount: Rs. " + billAmount);
    }

    public static double calculateBillAmount(int unitsConsumed, String ebConnectionType) {
        double billAmount = 0.0;

        if (ebConnectionType.equalsIgnoreCase("domestic")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 1.0;
            } else if (unitsConsumed <= 200) {
                billAmount = 100 + (unitsConsumed - 100) * 2.5;
            } else if (unitsConsumed <= 500) {
                billAmount = 100 + 100 * 2.5 + (unitsConsumed - 200) * 4;
            } else {
                billAmount = 100 + 100 * 2.5 + 300 * 4 + (unitsConsumed - 500) * 6;
            }
        } else if (ebConnectionType.equalsIgnoreCase("commercial")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 2.0;
            } else if (unitsConsumed <= 200) {
                billAmount = 100 + (unitsConsumed - 100) * 4.5;
            } else if (unitsConsumed <= 500) {
                billAmount = 100 + 100 * 4.5 + (unitsConsumed - 200) * 6;
            } else {
                billAmount = 100 + 100 * 4.5 + 300 * 6 + (unitsConsumed - 500) * 7;
            }
        }

        return billAmount;
    }
}

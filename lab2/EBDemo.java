/* Develop a Java application to generate Electricity bill. Create a class with the following members:
Consumer no., consumer name, previous month reading, current month reading, and type of EB
connection (i.e. domestic or commercial). Compute the bill amount using the following tariff. 

If the type of the EB connection is domestic, calculate the amount to be paid as follows:
    1. First 100 units - Rs. 1 per unit
    2. 101-200units - Rs. 2.50 per unit
    3. 201 -500 units - Rs. 4 per unit
    4. >501 units - Rs. 6 per unit
If the type of the EB connection is commercial, calculate the amount to be paid as follows:
    1. First 100 units - Rs. 2 per unit
    2. 101-200units - Rs. 4.50 per unit
    3. 201 -500 units - Rs. 6 per unit
    4. >501 units - Rs. 7 per unit */

import java.util.Scanner;
class EBgenerator {
    String consumerNum;
    String consumerName;
    String EBtype;
    double  prevMonthReading;
    double currMonthReading;
    double units;
    double total;

    EBgenerator(String cnum, String cname, double preading, double creading, String EB) {
        consumerNum = cnum;
        consumerName = cname;
        prevMonthReading = preading;
        currMonthReading = creading;
        EBtype = EB;
    }

    double calculateAmmount() {
        units = currMonthReading - prevMonthReading;
        if (EBtype.equalsIgnoreCase("domestic")) {
                if (units <= 100) {
                    return units * 1;
                }
                else if (units <= 200) {
                    return (100 + (units - 100) * 2.5);
                }
                else if (units <= 500) {
                    return (100 + ( 100) * 2.5 + (units - 200) * 4);
                }
                else {
                    return (100 + (100) * 2.5 +  300 * 4 + (units - 500) * 6);
                }
        }
        else if (EBtype.equalsIgnoreCase("commercial")) {
            if (units <= 100){
                return units * 2;
            } 
            else if (units <= 200) {
                return (100 * 2 + (units - 100) * 4.5);
            } 
            else if (units <= 500) {
                return (100 * 2 + 100 * 4.5 + (units - 200) * 6);
            } 
            else {
                return (100 * 2 + 100 * 4.5 + 300 * 6 + (units - 500) * 7);
            }

        }
        return -1;
    }
}
    

class EBDemo {
    public static void main(String args[]) {
            String conNumber;
            String conName;
            double prevMonReading;
            double currMonReading;
            String EBconnection;

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter consumer number: ");
            conNumber = scan.nextLine();

            System.out.print("Enter consumer name: ");
            conName = scan.nextLine();

            System.out.print("Enter connection type(domestic/commercial): ");
            EBconnection = scan.nextLine();

            System.out.print("Enter previous month reading: ");
            prevMonReading = scan.nextDouble();

            System.out.print("Enter current month reading: ");
            currMonReading = scan.nextDouble();

            scan.close();
            
            EBgenerator bill1 = new EBgenerator(conNumber,conName,prevMonReading,currMonReading,EBconnection);
            if (bill1.calculateAmmount() == -1) {
                System.out.println("Enter valid connection type");
            }
            else {
                System.out.println("Consumer name: " + bill1.consumerName);
                System.out.println("Consumer number: " + bill1.consumerNum);
                System.out.println("Previous month reading: " + bill1.prevMonthReading);
                System.out.println("Current month reading: " + bill1.currMonthReading);
                System.out.println("Connection type: " + bill1.EBtype);
                System.out.println("Consumed units: " + bill1.units);
                System.out.println("Total ammount: " + bill1.calculateAmmount());
            }
    }
}
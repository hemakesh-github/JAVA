import java.util.Scanner;

class Invoice {
	String partNumber;
	String partDescription;
	int quantity;
	double pricePerItem;
	double invoiceAmmount;
	
	//seting partNumber
    void setPartNumber(String pnum) {
		partNumber = pnum;
	}

	// seting getpartNumber
	String getPartNumber() {
		return partNumber;
	}

	// seting partDescription	
	void setPartDescription(String pdescription) {
		partDescription = pdescription;	
	}

	// geting partDescription
	String getPartDescription() {
		return partDescription;
	}

	void setQuantity (int quan) {
		quantity = quan; 
	}

	int getQuantity() {
		return quantity;
	}

	void setPricePerItem(double priceperitem) {
		pricePerItem = priceperitem;
	}

	double getPricePerItem() {
		return pricePerItem;
	}


	double getInvoiceAmmount() {
		return quantity * pricePerItem;
	}

	 
}



public class InvoiceDemo {

	public static void main(String args[]) { 
		

		Invoice obj1 = new Invoice();
		Scanner scanner = new Scanner(System.in);


		System.out.print("Enter Part Number: ");
        	String partNumber = scanner.nextLine();
		obj1.setPartNumber(partNumber);
		
		
		System.out.print("Enter Part Description: ");
        	String partDescription = scanner.nextLine();
		obj1.setPartDescription(partDescription);
		
		System.out.print("Enter price per item: ");
        	double pricePerItem = scanner.nextDouble();
		obj1.setPricePerItem(pricePerItem);
		
		System.out.print("Enter Quantity: ");
        	int quantity = scanner.nextInt();
		obj1.setQuantity(quantity);
		

 		scanner.close();
		
		System.out.println("Part Number: " + obj1.getPartNumber());
		System.out.println("Part Description: " + obj1.getPartDescription());
		System.out.println("quantity: " + obj1.getQuantity());
		System.out.println("price per item: " + obj1.getPricePerItem());
		System.out.println("Invoice ammount: " + obj1.getInvoiceAmmount());
	}
}




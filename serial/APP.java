import java.io.*;



class Employee implements Serializable{
	int employeeId;	
	String employeeName;
}

public class APP{
	public static void main(String args[]) throws IOException, FileNotFoundException, ClassNotFoundException {
		Employee employeeHemakesh = new Employee();
		Employee employeeKarthik = new Employee();
		employeeHemakesh.employeeId = 98;
		employeeKarthik.employeeId = 93;
		employeeHemakesh.employeeName = "Hemakesh";
		employeeKarthik.employeeName = "Karthik";
		
		
		FileOutputStream fileOutputObject = new FileOutputStream("employee.ser");
		ObjectOutputStream objectStreamForSerialization = new ObjectOutputStream(fileOutputObject);
		objectStreamForSerialization.writeObject(employeeHemakesh);
		objectStreamForSerialization.writeObject(employeeKarthik);
		System.out.println("Object serialization Done");
	 	

		FileInputStream fileInputStream = new FileInputStream("employee.ser");
		ObjectInputStream objectStreamForDeserialization = new ObjectInputStream(fileInputStream);
		Employee employee = (Employee)objectStreamForDeserialization.readObject();
		System.out.println(employee.employeeId);
		System.out.println(employee.employeeName);
		employee = (Employee)objectStreamForDeserialization.readObject();
		
		
		
		
	}
}

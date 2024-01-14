import java.util.Scanner;
class CourseException extends  Exception{
	int n;

	CourseException(int i) {
		n = i;
	}

	public String toString() {
		String msg = "Course " + n + " Object is not created";
		return msg;
	}

}


class Course{
	String department;
	int courseNumber;
	double credits;
	
	Course(String d, int num, double c) {
		department = d;
		courseNumber = num;
		credits = c;
	}
}


class CourseExceptionTest{

	static void check(String dept, int num, double c, int n) throws CourseException{
		
		if (dept.length() > 3 || num < 1001 || num > 9999 || c < 1 || c > 6) {
			throw new CourseException(n);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dept;
		int courseNum;
		double credits;
		
		Course[] c = new Course[6];
		for(int i = 0; i < 6; i++) {
			System.out.println("Please enter course " + (i+1) + " details:");
			System.out.print("Enter course department: ");
			dept = sc.nextLine();

			System.out.print("Enter course number: ");
			courseNum = sc.nextInt();

			System.out.print("Enter course credits: ");
			credits = sc.nextDouble();
			try {
				check(dept, courseNum, credits, (i+1));
				c[i] = new Course(dept, courseNum, credits);
				System.out.println("Course " + (i+1) + " object is created successfully");
			}
			catch(CourseException e) {
				System.out.println(e);
				c[i] = new Course(dept, courseNum, credits);
			}
			
			sc.nextLine();	
		}
	}
	

}
import java.util.Scanner;

class ScoreException extends Exception {
	double detail;
	ScoreException(double m) {
		detail = m;
	}

	public String toString() {
		String msg = String.format("%.2f is not a valid score ", detail);
		return msg;
	}  
}

class Student {
	String id;
	double[] subMarks = new double[3];
	
	Student(String i) {
		id = i;
	}

	double validInput(Scanner s) throws ScoreException {
		double score = s.nextDouble();
		
		if((score > 100) || (score < 0)) {
			throw new ScoreException(score);
		}
		return score;
	}

	void takeMarks(Scanner s) {
		//Scanner s = new Scanner(System.in);
		System.out.println("Student id: " + id);
		for(int i = 0; i < 3; i++) {
			System.out.print("Subject " + (i+1) + ": ");
			try {
				subMarks[i] = validInput(s);
			}
			catch(ScoreException se) {
				System.out.println(se);
				System.out.print("Subject " + (i+1) + ": ");
				subMarks[i] = s.nextDouble();
			}
			
		}
	
	}

	void getMarksOfStudent() {
		double t = 0;
		for(int i = 0; i < 3; i++) {
			System.out.println("Subject " + (i+1) + ": "+ subMarks[i]);
			t += subMarks[i];
		}
		System.out.println("Average Marks: " + t/3);
	}

}

class SportTestDemo {
	public static void main(String[] args)
	{
		
		Student[] ob = new Student[5];
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter student id: ");
			String id = s.nextLine();
			ob[i] = new Student(id);
			ob[i].takeMarks(s);
		}
		System.out.println("Displaying student marks");
		for(int i = 0; i < 5; i++) {
			ob[i].getMarksOfStudent();
		}	
	}
}
// GradebookApp.java v.20160502

class GradebookApp {
	
	public static void main(String[] args) {
		System.out.println("Grades");

		String student = "Adrian";
		System.out.println("Highest Grade:" + student.high_grades());
		System.out.println("Lwest Grade :" + student.low_grades());
		System.out.println("Average:" + student.avg_grades());
		Ststem.out.println("Letter Grade:" + student.letter_grade(student.avg_grades()));
		

		
	}
}
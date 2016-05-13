import java.util.Random;

class Student {

	double[] grades = new double [10];
	String  name;

		

		public Student(String n){
			name = n;


			for(int i = 0; i < grades.length; i++) {			
				grades[i] = (Math.random()*100) + 1;
				System.out.println(grades[i]);
			}
		}
			
		public double high_grades(){
			double max = grades[0];

			for(int i = 0; i < 10; i++){
				if(grades[i] > max) {

				}
			}
			return max;
		}

		public double low_grades() {
			double min = grades[0];
			
			for(int i = 0; i < 10; i++) {
				if(grades[i] < min) {
					min = grades[i];
				}
			}
			return min;
		}

		public double avg_grades() {
			double sum = 0;
			for(int i = 0; i < 10; i++) {
				sum = sum + grades[i];
			}
			double average = sum/10;
			return average;
		}

		static char letter_grade(double avg_grades) {
			char letter = ' ';
			if(avg_grades >= 90 && avg_grades <= 100)
				letter = 'A';
			if(avg_grades >= 80 && avg_grades <= 89)
				letter = 'B';
			if(avg_grades >= 70 && avg_grades <= 79)
				letter = 'C';
			if(avg_grades >= 60 && avg_grades <= 69)
				letter = 'D';
			else
				letter = 'F';
			return letter;


		}

}
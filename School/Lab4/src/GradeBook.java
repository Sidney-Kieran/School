import java.io.*;

public class GradeBook {
	
	private enum Grades{A, B, C, D};
	
	public static void main(String[] args) throws Exception{
		int s = 0;
		double[] scores = new double[10];
		Grades[] grade = new Grades[scores.length];
		int[] stars = new int[grade.length];

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double avg;
		
		System.out.printf("Please Enter your scores(enter a negative number to stop): \n");
		
		double value = Double.parseDouble(reader.readLine());
		while(value >= 0) {
			scores[s] = value;
			value = Double.parseDouble(reader.readLine());
			s++;
		}
		
		System.out.println("\n---------------------------------------------------------------------------------");
		
		System.out.printf("\nThe Scores are: ");
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%.2f ", scores[i]);
		}
		System.out.println("\n---------------------------------------------------------------------------------");
		
		for (int i = 0; i < stars.length; i++) {
			stars[i] = 0;
		}
		avg = aveScore(scores);
		
		System.out.printf("Average Score: %.2f Maximum Score: %.2f", avg, maxScore(scores));
		System.out.println("\n---------------------------------------------------------------------------------");
		
		printGrade(scores, grade);
		System.out.println("\n---------------------------------------------------------------------------------");
		
		histogram(grade, stars);
		
		System.out.println("\n---------------------------------------------------------------------------------");
		
		SelectionSort(scores);
		
		System.out.println("\n---------------------------------------------------------------------------------");
		
		double[] array1 = {1, 2, 3, 4, 5};
		double[] array2 = {6, 7, 8, 9,10, 11, 12};
		Double[] array3 = merge(array1, array2);
		
		System.out.printf("Merged elements: ");
		for (int i = 0; i < array3.length; i++) {
			System.out.printf("%.2f ", array3[i]);
		}
		System.out.println("\n---------------------------------------------------------------------------------");
	}



	public static Double[] merge(double[] a, double[] b) {
		Double[] array3 = new Double[a.length + b.length];
		
		for (int i = 0; i < a.length; i++) {
			array3[i] = a[i];
			
			for (int j = 0; j < b.length; j++) {
				array3[a.length + j] = b[j];
			}
		}
		return array3;
	}

	public static double aveScore(double[] scores) {
		double sum = 0;
		double avg;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = sum / scores.length;
		return avg;
	}

	public static void histogram(Grades[] grade, int[] stars) {
		for (int i = 0; i < grade.length; i++) {
			if(grade[i] == Grades.A){
				stars[0]++;
			}
			if(grade[i] == Grades.B){
				stars[1]++;
			}
			if(grade[i] == Grades.C){
				stars[2]++;
			}
			if(grade[i] == Grades.D){
				stars[3]++;
			}
		}
		System.out.printf("A: ");
		for (int i = 0; i < stars[0]; i++) {
			System.out.printf("x");
		}
		System.out.printf("\nB: ");
		for (int i = 0; i < stars[1]; i++) {
			System.out.printf("x");
		}
		System.out.printf("\nC: ");
		for (int i = 0; i < stars[2]; i++) {
			System.out.printf("x");
		}
		System.out.printf("\nD: ");
		for (int i = 0; i < stars[3]; i++) {
			System.out.printf("x");
		}
	}

	public static void printGrade(double[] scores, Grades[] grade) {
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] >= 90){
				grade[i] = Grades.A;
			}else
				if(scores[i] >= 80){
					grade[i] = Grades.B;
			}else
				if(scores[i] >= 70){
					grade[i] = Grades.C;
			}else{
				grade[i] = Grades.C;
			}
		}
		System.out.printf("Letter Grades: ");
		for (int i = 0; i < grade.length; i++) {
			System.out.printf("%s ", grade[i]);
		}
	}
	
	public static void SelectionSort(double a[])
	{
		System.out.printf("The sorted order is: ");
		double t;
		int i, j, min;   //this function carries out N^2/2 comparisons and N exchanges
	    for(i=0; i<a.length; i++) //for the worst, average and best cases.
	    {                   //this therefore emanates that the running time of this
	        min = i;        //algorithm does not depend on the number of inputs but the
	        for(j = i + 1; j < a.length; j++) //the number of times "min" is updated
	            if(a[j] < a[min])
	                min = j;
	        t = a[min];
	        a[min] = a[i];
	        a[i] = t;
	    }
	    for (int k = 0; k < a.length; k++) {
			System.out.printf("%.2f ", a[k]);
		}
	   
	}
	
	public static double maxScore(double scores[]){
		double max = 0;
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] >= max){
				max = scores[i];
			}
		}
		return max;
		
	}
}

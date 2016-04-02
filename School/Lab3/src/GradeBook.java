
public class GradeBook {
	
	private enum Grades{A, B, C, D};
	
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
	
	public static void main(String[] args){
		double[] scores = {82.4, 72.6, 90, 96.8, 86.1};
		Grades[] grade = new Grades[scores.length];
		double avg;
		double max = 0;
		double sum = 0;
		int[] stars = new int[grade.length];
		
		System.out.printf("The Scores are: ");
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%.2f ", scores[i]);
		}
		System.out.println("\n--------------------------------------------------------------------");
		
		for (int i = 0; i < stars.length; i++) {
			stars[i] = 0;
		}
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			if(scores[i] >= max){
				max = scores[i];
			}
		}
		avg = sum / scores.length;
		
		System.out.printf("Average Score: %.2f Maximum Score: %.2f", avg, max);
		System.out.println("\n--------------------------------------------------------------------");
		
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
		System.out.println("\n--------------------------------------------------------------------");
		
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
		
		System.out.println("\n--------------------------------------------------------------------");
		
		SelectionSort(scores);
		
	}
}


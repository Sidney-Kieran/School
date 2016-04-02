
public class Course {

	Student[] students = new Student[10];
	String courseName;
	Course(String courseName){
		
			this.courseName = courseName;
			
		
	}
	
	public boolean checkOff(Student student, double score){
		boolean remark = false;
		for (int i = 0; i < this.students.length; i++) {
			if (students[i].name.equals(student.name)) {
				students[i].addPoints(score);
				remark = true;
			}
		}
		return remark;
		
	}
	
	public void addStudent(Student stud){
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = stud;
				break;
			}
		}
	}
	
	public double average(){
		double sum = 0.0;
		double avg;
		
		for (int i = 0; i < students.length; i++) {
			sum += students[i].total;
		}
		
		avg = sum/students.length;
		
		return avg;
	}
	
	public void report(){
		
		String finalReport;
		String remark;
		for (int i = 0; i < students.length; i++) {
			finalReport = students[i].toString();
			if(students[i].total >= average()){
				remark = "Pass";
			}
			else{
				remark = "Fail";
			}
			System.out.println(finalReport + " " + remark);
		}
		
	}
}

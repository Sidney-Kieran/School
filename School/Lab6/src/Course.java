import java.util.*;
public class Course {

	
	ArrayList <Student> students = new ArrayList<Student>();
	ArrayList <Double> studentGrades = new ArrayList<Double>();
	
	String courseName;
	
	
	Course(String courseName){
		
			this.courseName = courseName;
			
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void addPoints(double points, String Name ){
		for (int i = 0; i < this.students.size(); i++) {
			if (this.students.get(i).name.equals(Name)) {
				this.studentGrades.add(points);
			}
		}
	}
	
	public double studentScore(Student studentName){
		double total = 0.0;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).name.equals(studentName.name)) {
				total = studentName.total;
			}
		}
		return total;
	}
	
	
	public void addStudent(Student stud){
		students.add(stud);
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).name.equals(stud.name)) {
				students.get(i).addCourse(this);
			}
			
		}
		
	}
	
	public boolean checkOff(Student student, double score){
		boolean remark = false;
		for (int i = 0; i < this.students.size(); i++) {
			if (students.get(i).name.equals(student.name)) {
				students.get(i).addPoints(score);
				remark = true;
			}
		}
		return remark;
		
	}
	
	public double averageAll(){
		double sum = 0.0;
		double avg;
		
		for (int i = 0; i < this.studentGrades.size(); i++) {
			sum += this.studentGrades.get(i);
		}
		
		avg = sum/students.size();
		
		return avg;
	}
	
	public void report(){
		String rmk;
		System.out.println(this.courseName);
		System.out.println("*************");
		for (int i = 0; i < students.size(); i++) {
			if(this.studentGrades.get(i) >= this.averageAll()){
				rmk = "Pass";
			}
			else{
				rmk = "Fail";
			}
			System.out.println(students.get(i).name + ":" + " " + rmk);
		}
		System.out.println("");
	}
}


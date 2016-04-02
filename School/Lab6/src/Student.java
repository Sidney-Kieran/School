import java.util.*;

public class Student {
	String name;
	double total;
	ArrayList <Course> courses = new ArrayList<Course>();
	
	Student(String name){
		this.name = name;
	}
	public void addCourse(Course courseName){
		this.courses.add(courseName);
	}
	public void addPoints(double newPoints){
		this.total += newPoints;
	}
	
	public void printCourse(){
		for (int i = 0; i < this.courses.size(); i++) {
			
			System.out.println(this.courses.get(i).courseName);
		}
	}
	public double getPoints(Course courseName){
		double sum = 0.0;
		for (int i = 0; i < this.courses.size(); i++) {
			if (this.courses.get(i).courseName.equals(courseName)) {
				for (int j = 0; j < this.courses.get(i).students.size(); j++) {
					if(this.name.equals(courses.get(i).students.get(j).name)){
						sum = courses.get(i).studentGrades.get(j);
					}
				}
			}
		}
		return sum;
	}
	
	public void getCourses(){
		for (Course course : courses) {
			System.out.printf("%s", course.courseName);
		}
	}
	
	public String getName(){
		return this.name;
	}
	
	public String toString(){
		String rmk = "Fail";
		String rp = "";
		System.out.println(getName());
		System.out.println("*********");
		for (int i = 0; i < this.courses.size(); i++) {
			double average = this.courses.get(i).averageAll();
			for (int j = 0; j < courses.get(i).students.size(); j++) {
				double grade = this.courses.get(i).studentGrades.get(j);
				if (this.courses.get(i).students.get(j).name.equals(getName())) {
					
					if(grade >= average){
						rmk = "Pass";
					}
					else{
						rmk = "Fail";
					}
					System.out.println(this.courses.get(i).courseName + ":" + " "  + rmk);
					
				}
			}
		}
		return rp;
	}
}

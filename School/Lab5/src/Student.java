
public class Student {
	String name;
	double total;
	Course[] courses;
	
	Student(String name){
		this.name = name;
		this.total = 0.0;
	}
	
	public void addPoints(double newPoints){
		this.total += newPoints;
	}
	
	public double getPoints(){
		return total;
	}
	
	public String toString(){
		String print = String.format("%s %.2f", name, total);
		return print;
	}
	
	public void reportCard(){
		String remark;
		for (int i = 0; i < courses.length; i++) {
			if(courses[i] != null){
				double a = courses[i].average();
				if (a >= this.total) {
					remark = "Pass";
				}
				else{
					remark = "Fail";
				}
			  System.out.println(courses[i].courseName + remark);
			}
		}
	}
}

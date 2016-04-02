
public class GBProgramExtra {
	public static void main(String[] args){
		Student student = new Student("Sidney");
		Course course = new Course("French");
		
		course.addStudent(student);
		
		for (int i = 0; i < course.students.length; i++) {
			System.out.println(course.students[i]);
		}
	}
}

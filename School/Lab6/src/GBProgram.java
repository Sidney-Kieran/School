
public class GBProgram {
	public static void main(String[] args){
		Student Chilongo = new Student("Chilongo");
		Student Gikamdi = new Student("Gikamdi");
		Student Amwayi = new Student("Amwayi");
		
		Course Accounts = new Course("Accounts");
		Course AITI = new Course("AITI");
		Course InformationSystems = new Course("Information Systems");
		Course Economics = new Course("Economics");
		
		Accounts.addStudent(Chilongo);
		Accounts.addPoints(45.0, "Chilongo");
		Accounts.addStudent(Gikamdi);
		Accounts.addPoints(55.0, "Gikamdi");
		Accounts.addStudent(Amwayi);
		Accounts.addPoints(48.0, "Amwayi");
		
		AITI.addStudent(Chilongo);
		AITI.addPoints(43.5, "Chilongo");
		AITI.addStudent(Gikamdi);
		AITI.addPoints(44.5, "Gikamdi");
		AITI.addStudent(Amwayi);
		AITI.addPoints(33.5, "Amwayi");
		
		InformationSystems.addStudent(Chilongo);
		InformationSystems.addPoints(46.4, "Chilongo");
		InformationSystems.addStudent(Gikamdi);
		InformationSystems.addPoints(56.4, "Gikamdi");
		
		
		Economics.addStudent(Chilongo);
		Economics.addPoints(50, "Chilongo");
		Economics.addStudent(Gikamdi);
		Economics.addPoints(50.5, "Gikamdi");
		Economics.addStudent(Amwayi);
		Economics.addPoints(55, "Amwayi");
		
		Accounts.report();
		AITI.report();
		InformationSystems.report();
		Economics.report();
		
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println(Chilongo.toString());
		System.out.println(Gikamdi.toString());
		System.out.println(Amwayi.toString());
	}
}

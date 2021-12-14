package kodlamaioProject;

public class Main {

	public static void main(String[] args) {
		Student student1= new Student();
		student1.setId(1);
		student1.setFirstName("Burcu");
		student1.setLastName("Bayık");
		student1.setEmail(".......");
		student1.setPassword("*****");
		student1.setPercentageOfProgress(50);
		Student student2=new Student();
		student2.setId(2);
		student2.setFirstName("Duygu");
		student2.setLastName("Ergün");
		Student[] students= {student1,student2};
		
		UserManager userManager=new UserManager();
		userManager.addUser(student1);
		StudentManager studentManager= new StudentManager();
		studentManager.showPercentage(student1);
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.getCoursers(students);
		

	}

}

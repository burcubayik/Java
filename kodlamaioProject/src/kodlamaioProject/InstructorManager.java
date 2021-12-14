package kodlamaioProject;

public class InstructorManager extends UserManager {
	Student[] students;
	public void getCoursers(Student[] students) {
		
		this.students=students;
		for(Student student:students)
		{
		System.out.println("Kursu alanlar: "+ student.getFirstName() + " "+student.getLastName());
		}
	}
	

}

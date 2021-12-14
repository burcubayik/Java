package kodlamaioOdev;

public class Course {
	public Course() {}
	public Course(int id,String name, int progressPercentage, String teacherName) {
		this.id=id;
		this.name=name;
		this.progressPercentage= progressPercentage;
		this.teacherName=teacherName;
	}
	int id;
	String name;
	int progressPercentage;
	String teacherName;
	
	

}

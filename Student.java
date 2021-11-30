package kodlamaioProject;

public class Student extends User {
	 int percentageOfProgress;
	 public Student(int percentageOfProgress, String[] takenOfCourses) {
		super();
		this.percentageOfProgress = percentageOfProgress;
		
	}

	

	public Student() {
		
	}

	public int getPercentageOfProgress() {
		return percentageOfProgress;
	}

	public void setPercentageOfProgress(int percentageOfProgress) {
		this.percentageOfProgress = percentageOfProgress;
	}

	
	
	

}

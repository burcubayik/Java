package kodlamaioProject;

public class UserManager {
	public void addUser(User user) {
		System.out.println("kullanýcý eklendi " + user.getFirstName() +" "+ user.getLastName());
		
	}
	public void deleteUser(User user) {
		System.out.println("kullanýcý silindi " + user.getFirstName() +" "+ user.getLastName());
		
	}
	public void updateUser(User user) {
		System.out.println("kullanýcý güncellendi " + user.getFirstName() +" "+ user.getLastName());
		
	}
	

}

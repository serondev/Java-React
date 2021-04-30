
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.id = 1;
		instructor1.firstName = "Engin";
		instructor1.lastName = "Demirog";
		instructor1.instructorNumber = "0001";
		instructor1.courseGiven = "Yazilim Gelistirme Kampi (Java + React)";
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor1);
		instructorManager.addCourse(instructor1);
		
		Student student1 = new Student();
		student1.id = 1;
		student1.firstName = "Serkan";
		student1.lastName = "Onder";
		student1.studentNumber = "0001";
		student1.courseGetting = "Yazilim Gelistirme Kampi (Java + React)";
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.addCourse(student1);
		

		UserManager userManager = new UserManager();
		User[] users = {instructor1,student1};
		userManager.addMultiple(users);
		
		

	}

}

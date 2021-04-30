
public class InstructorManager {
	public void login(Instructor instructor)
	{
		System.out.println(instructor.firstName + instructor.lastName + " giris yapti.");
	}
	public void addCourse(Instructor instructor)
	{
		System.out.println(instructor.firstName + " " + instructor.instructorNumber + " " + instructor.courseGiven + " " + "dersini vermektedir.");
	}

}

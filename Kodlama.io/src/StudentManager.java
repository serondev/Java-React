
public class StudentManager {
	public void add(Student student)
	{
		System.out.println(student.firstName + " " + student.lastName + " "+ "kayit oldu.");
	}
	
	public void addCourse(Student student)
	{
		System.out.println(student.studentNumber + " "+ "numarali ogrenci" +" "+ student.courseGetting + " "+ "dersini almaktadir.");
	}

}

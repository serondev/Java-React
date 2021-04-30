public class UserManager {
	
	public void add(User user)
	{
		System.out.println(user.firstName +" "+ user.lastName + " sisteme kaydedilmistir.");
	}
	public void addMultiple(User[] users) 
	  {
		  for(User user : users)//User turundeki usersdaki her bir user icin bunu calistir...
			  {
			  add(user);
		  }
		  
	  }

}

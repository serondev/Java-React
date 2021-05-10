package Business.abstracts;

import Entities.concreates.User;
import dataAccesss.abstracts.UserDao;

public interface UserControlService {
	boolean validFirstName(String firstName);
	
	boolean validLastName(String lastName);
	
	boolean validPassword(String password);
	
	boolean validEMail(String eMail);
	
	boolean validUser(User user, UserDao userDao);
	
	boolean loginInput(String email,String password, UserDao userDao);

}

package dataAccesss.abstracts;

import java.util.List;

import Entities.concreates.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	
	User getId(int id);
	
	User getEmail(String eMail);
	
	List<User> getAll();	

}

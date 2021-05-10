package Business.abstracts;

import Entities.concreates.User;

public interface UserService {
	void register(User user);
	void login(String email,String password);
	void update(User user);
	void delete(User user);

}

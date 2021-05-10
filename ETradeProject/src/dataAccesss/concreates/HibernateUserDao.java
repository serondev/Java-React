package dataAccesss.concreates;

import java.util.ArrayList;
import java.util.List;

import Entities.concreates.User;
import dataAccesss.abstracts.UserDao;

public class HibernateUserDao implements UserDao{
	
	List<User> usersInDatabase = new ArrayList<>();

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile sisteme kayıt edildi: " + user.geteMail());
		usersInDatabase.add(user);
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi : " + user.geteMail());
		usersInDatabase.remove(getId(user.getId()));
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile güncellendi: " + user.geteMail());
		usersInDatabase.remove(getId(user.getId()));
		usersInDatabase.add(user);
		
	}

	@Override
	public User getId(int id) {
		List<User> users = getAll();
		if(users != null) {
			for (User user : users) {
				if(user.getId() == id) return user;
			}
		}
		return null;
	}

	@Override
	public User getEmail(String eMail) {
		List<User> users = getAll();
		if(users != null) {
			for (User user : users) {
				if(user.geteMail().equals(eMail)) return user;
			}
		}
		return null;
	}
	

	@Override
	public List<User> getAll() {
		
		return usersInDatabase;
	}

}

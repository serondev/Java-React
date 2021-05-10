package Business.concreates;

import Business.abstracts.UserControlService;
import Business.abstracts.UserService;
import Entities.concreates.User;
import dataAccesss.abstracts.UserDao;

public class UserManager implements UserService{
	
	private final UserDao userDao;
	private final UserControlService userControlService;

	public UserManager(UserDao userDao, UserControlService userControlService) {
		super();
		this.userDao = userDao;
		this.userControlService = userControlService;
	}

	@Override
	public void register(User user) {
		if(userControlService.validUser(user, userDao))
		{
			userDao.add(user);
			System.out.println("Kayıt başarılı! ");
			return;
		}
		System.out.println("Kayıt başarısız. ");
		
	}

	@Override
	public void login(String email, String password) {
		if(userControlService.loginInput(email, password, userDao))
		{
			System.out.println("Kullanıcı giris yapti !");
			return;
		}
		System.out.println("Kullanıcı girisi basarısız !");
	}

	@Override
	public void update(User user) {
		if(userControlService.validUser(user, userDao))
		{
			userDao.update(user);
			System.out.println("Güncelleme başarılı ");
			return;
		}
		System.out.println("Güncelleme başarısız ");
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		System.out.println("Kullanıcı silindi! ");
		
	}

}

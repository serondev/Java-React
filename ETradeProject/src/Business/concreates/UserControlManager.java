package Business.concreates;

import java.util.regex.Pattern;

import Business.abstracts.UserControlService;
import Core.abstracts.AuthService;
import Core.abstracts.EmailService;
import Entities.concreates.User;
import dataAccesss.abstracts.UserDao;

public class UserControlManager implements UserControlService{
	private AuthService authService;
	private final EmailService emailService;
	

	public UserControlManager(AuthService authService, EmailService emailService) {
		super();
		this.authService = authService;
		this.emailService = emailService;
	}

	@Override
	public boolean validFirstName(String firstName) {
		if(firstName.length() >= 2) return true;
		System.out.println("Ad 2 karakterden az olamaz! ");
		return false;
	}

	@Override
	public boolean validLastName(String lastName) {
		if(lastName.length() >= 2)return true;
		System.out.println("SoyAd 2 karakterden az olamaz! ");
		return false;
	}

	@Override
	public boolean validPassword(String password) {
		if (password.length() >= 6)return true;
		System.out.println("Şifre 6 karakterden az olamaz! ");
		return false;
	}

	@Override
	public boolean validEMail(String eMail) {
		String eMailRegex = "\\\\w+(\\\\.\\\\w+)*@[a-zA-Z]+(\\\\.\\\\w{2,6})+$";
		Pattern pattern = Pattern.compile(eMailRegex,Pattern.CASE_INSENSITIVE);
		if(eMail == null) {
			System.out.println("Yanlış E-Mail Formatı! ");
			return false;
		}else if(!pattern.matcher(eMail).matches()) System.out.println("Yanlış E-Mail Formatı!");

		return true;
	}

	@Override
	public boolean validUser(User user, UserDao userDao) {
		 if (authService != null) return authService.validUser();
	        if (!validFirstName(user.getFirstName())) return false;
	        else if (!validLastName(user.getLastName())) return false;
	        else if (!validEMail(user.geteMail())) return false;
	        else if (!validPassword(user.getPassword())) return false;
	        emailService.sendVerificationMail(user.geteMail());
	        System.out.println("Doğrulandı.!.");
	        return true;
		
	}

	@Override
	public boolean loginInput(String email, String password, UserDao userDao) {
		if (authService != null) return authService.validUser();
        User user = userDao.getEmail(email);
        if (user == null) {
            System.out.println("Incorrect e-mail!");
            return false;
        } else if (!user.getPassword().equals(password)) {
            System.out.println("Incorrect password!");
            return false;
        }
        return true;
    }
		
	}



import Business.abstracts.UserControlService;
import Business.concreates.UserControlManager;
import Business.concreates.UserManager;
import Core.abstracts.AuthService;
import Core.concreates.EmailManager;
import Core.concreates.GoogleAuthManagerAdapter;
import Entities.concreates.User;
import Google.GoogleAuthManager;
import dataAccesss.concreates.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Serkan","Önder","sssonder72@gmail.com","123456");
		User user2 = new User(2,"Gökçe","Varol","varolgokce2@hotmail.com","1234567");
		User user3 = new User();
		
		System.out.println();
		
		UserManager userManager1 = new UserManager(new HibernateUserDao(),new UserControlManager(new EmailManager());
		userManager1.register(user1);
		userManager1.login(user1.geteMail(),user1.getPassword());
		
		System.out.println();
		
		userManager1.register(user2);
		userManager1.login(user2.geteMail(),user2.getPassword());
		
		System.out.println();
		
		UserManager userManager2 = new UserManager(new HibernateUserDao(),new UserControlManager(new GoogleAuthManagerAdapter(),new EmailManager()));
		userManager2.register(user3);
		userManager2.login(user3.geteMail(), user3.getPassword());

	}

}

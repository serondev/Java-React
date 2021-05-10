package Core.concreates;

import Core.abstracts.EmailService;

public class EmailManager implements EmailService{

	@Override
	public void sendVerificationMail(String message) {
		System.out.println("Doğrulama maili gönderilmiştir " );
		
	}

}

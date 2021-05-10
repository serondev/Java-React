package Core.concreates;

import Core.abstracts.AuthService;
import Google.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService{

	@Override
	public boolean validUser() {
		
		return new GoogleAuthManager().validUserByGoogle();
	}

}

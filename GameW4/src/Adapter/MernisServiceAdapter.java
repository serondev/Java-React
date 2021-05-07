package Adapter;

import Business.abstracts.PlayerCheckService;
import Entities.concreates.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService{

	@Override
	public boolean CheckIfRealPerson(Player player) {
		boolean result = false;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getName().toUpperCase(), player.getSurName().toUpperCase(),player.getBirthDate());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		
		return result;
	}
	
	

}

package Adaptor;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MerniceServiceAdaptor implements CustomerCheckService {

	@Override
	public boolean checkCustomer(Customer customer) {
	
		return false;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}

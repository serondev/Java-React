package Concreate;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerCheckService
{
	CustomerCheckService customerCheckService;
	
	@Override
	public void save(Customer customer) 
	{
		if(customerCheckService.checkCustomer(customer)) 
		{
			super.save(customer);
		}
		System.out.println("Not a real person");
		
	}

	@SuppressWarnings("unused")
	private boolean checkifrealPerson(final Customer customer) 
	{
		
		MernisServiceReference.KPSPubliccSoapClient client  = new KPSPublicSoapClient();
		return true;
		
	}

	

	@Override
	public boolean checkCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}
		
	
	

}

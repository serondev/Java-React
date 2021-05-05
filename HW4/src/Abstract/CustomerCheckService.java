package Abstract;

import Entities.Customer;

public interface CustomerCheckService {
	
	boolean checkCustomer(Customer customer);

	void save(Customer customer);

}

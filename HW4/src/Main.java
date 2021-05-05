import Abstract.BaseCustomerManager;
import Concreate.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"Serkan","Onder", "16012000", "123456789"));
		

	}

}

package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber="1254";
		
		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.customerNumber="2544";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="2225";
		
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.add(hepsiburada); customerManager.add(engin);
		customerManager.add(abc);
		
	    System.out.println("--------------------");
	    
		Customer[] customers =new Customer[] {engin,abc,hepsiburada};
		customerManager.addMultiple(customers);
		 
		

	}

}

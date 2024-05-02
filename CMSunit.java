package LoginCust;

import java.util.List;

public class CMSunit {
	public static String authenticateCustomer(String email,String passward, List<Customer> list) throws CMSexception
	{
		//int index=list.indexOf(email); not accept list type is customer not email
		
		//create customer instance -- wrappint email
		
		Customer newCustomer=new Customer(email);
		int index=list.indexOf(newCustomer);
		if(index==-1)
			throw new CMSexception("invalid email bro");
		Customer customer= list.get(index);
		if(customer.getPassward().equals(passward))
		return "logiin....."+customer;
		throw new CMSexception("galat ho gaya bhai ......");		
	}

	public static String deleteCustomerDetails(String email,List<Customer>list)
	
	{
		
		return email;
		
	}

}

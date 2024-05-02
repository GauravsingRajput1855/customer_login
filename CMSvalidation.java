package LoginCust;

import java.time.LocalDate;
import java.util.List;

public class CMSvalidation{
	public static void checkForDupCustomer(String email,List<Customer>customerList)throws CMSexception{
		Customer newCust=new Customer(email);
		if(customerList.contains(newCust))
			throw new CMSexception("Duplicate email bro try something new ");
	}
	



public static ServicePlan parseAndValidatePlanAndCharges(String plan,double regAmount)throws CMSexception{

	ServicePlan serviceplan=ServicePlan.valueOf(plan.toUpperCase());
	if(serviceplan.getServicePlan()==regAmount)
	return serviceplan;
	throw new CMSexception("amount sahi se dal na bhai ");
}


	public static Customer valiCustomerInputes(String firstname, String lastname, String email, String passward, double regAmount,
			String string, String plan,List<Customer> customerList) throws CMSexception{
		checkForDupCustomer(email,customerList);
		
		ServicePlan servicePlan= parseAndValidatePlanAndCharges(plan,regAmount);
		LocalDate birthDate=LocalDate.parse(string);
		return new Customer(firstname, lastname, 0, email, passward, regAmount, birthDate, servicePlan);
	}

	
	
	public static void resetPassword(String newPassword,Customer customer){
        customer.setPassward(newPassword);
        System.out.println("Password Reset Success");}
}


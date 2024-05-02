package LoginCust;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("");
			System.out.println("enter the choice ");
			boolean exit=false;
			List<Customer> customerList = new ArrayList<>();
		while(!exit)
		{
			
			try {
				
				System.out.println("1 for register ");
				System.out.println("2 for display ");
				System.out.println("3 for login");
				System.out.println("4 for reset pass");
				switch(sc.nextInt())
				{
				
				case 1:
					System.out.println("enter customer details ");
					System.out.println("Enter customer details : firstName,  lastName,  email, "
							+ " password,	regAmount,  dob,  plan");
					Customer customer=CMSvalidation.valiCustomerInputes(sc.next(), sc.next(), sc.next(),
							sc.next(), sc.nextDouble(),sc.next(),sc.next(),customerList);
					customerList.add(customer);
					System.out.println("registered succisfully......");
					break;
				case 2:
					for(Customer c: customerList )
					{
						System.out.println(c);
					}
					
					break;
				case 3:
					System.out.println("enter email and passward ");
					customer=CMSunit.authenticateCustomer(sc.next(),sc.next(), customerList);
		
					break;
				case 4:
					System.out.println("enter new passward");
					customer=CMSunit.authenticateCustomer(sc.next(), sc.next(), customerList);
					customer.setPassward(sc.next());
					System.out.println("password changed");
					
					break;
				case 5:
					break;
				}
				
				
				
				
				
				
			}catch (Exception e) {
				sc.nextLine();
				System.out.println(e);
			}
	    }

	 }

  }
}

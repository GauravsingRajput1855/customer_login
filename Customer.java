package LoginCust;

import java.time.LocalDate;

public class Customer {
	private String Firstname;
	private String Lastname;
	private int CustId;
	private String email;
	private String passward;
	private double regAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private static int idGenerator;
	
	public Customer(String firstname, String lastname, int custId, String email, String passward, double regAmount,
			LocalDate dob, ServicePlan plan) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		this.email = email;
		this.passward = passward;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
		this.CustId=++idGenerator;
	}
	public ServicePlan getPlan() {
		return plan;
	}
	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public int getCustId() {
		return CustId;
	}
	public void setCustId(int custId) {
		CustId = custId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	@Override
	 public boolean equals(Object o) {
        if (o instanceof Customer) {
            // Downcasting Object o to CustomerAccount and storing it in c object of
            // CustomerAccount
            Customer c = (Customer) o;
            // invoker's object email = this.email
            return this.email.equals(c.email);
        }
        return false;
    }
	public double getRegAmount() {
		return regAmount;
	}
	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	
	public Customer(String email) {
		this.email=email;
	}
	
	public String toString() {
		return "custid "+CustId+" First Name "+Firstname+" Last Name \n"+Lastname+" regAmount \n"+regAmount+
				" email \n"+email+" date of Birth \n"+dob+" plan \n"+plan;
	}
	
	
}

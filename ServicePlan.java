package LoginCust;

public enum ServicePlan {
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private double Plancost;
	
	private ServicePlan(double cost)
	{
		this.Plancost=cost;
	}
	
	public double getServicePlan()
	{
		return Plancost;
	}
	
	
	

}

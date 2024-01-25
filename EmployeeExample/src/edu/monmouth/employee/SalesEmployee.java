package edu.monmouth.employee;

public class SalesEmployee implements Employee{
	private int commission;
	private int yearlyBase;
	
	public SalesEmployee(int yearlyBase)
	{
		this.yearlyBase=yearlyBase;
	}
	public void setCommission(int commission)
	{
		this.commission=commission;
	}
	public int getMonthlyPay()
	{
		return yearlyBase/12;
	}
	public String toString()
	{
		return "The commision and yearlyBase of SalesEmployee is "+"commission "+this.commission+" yearlyBase "+yearlyBase+" "+getMonthlyPay();
	}
	public boolean equals(Object object)
	{
		if(object instanceof SalesEmployee)
		{
			SalesEmployee semployee=(SalesEmployee)object;
			return getMonthlyPay()==semployee.getMonthlyPay();
			
		}
		return false;
	}

}

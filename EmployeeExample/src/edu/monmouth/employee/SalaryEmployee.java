package edu.monmouth.employee;

public class SalaryEmployee implements Employee{
	private int yearlySalary;
	
	public SalaryEmployee(int yearlySalary){
		this.yearlySalary=yearlySalary;
	}
	
	public int getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(int yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	public int getMonthlyPay()
	{ 
		return yearlySalary/12;
	}
	
	@Override
	public String toString()
	{
		return "The yearlySalary of SalaryEmployee is "+this.yearlySalary+" "+getMonthlyPay();
		
	}
	public boolean equals(Object object) {
		if(object instanceof SalaryEmployee)
		{
			SalaryEmployee salaryemployee=(SalaryEmployee)object;
			return getMonthlyPay()==salaryemployee.getMonthlyPay();
			
		}
		return false;
	}
}

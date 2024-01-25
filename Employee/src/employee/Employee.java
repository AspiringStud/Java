package employee;

public class Employee {
	String name;
	int age;
	double salary;
	String location;
	
	Employee(String name,int age,double salary,String location){
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.location=location;
	}
	public double raiseSalary() {
		double salaryRaise = (2.5 * this.salary);
		System.out.println("I am "+this.name +" and have a salary raise of "+salaryRaise);
		return salary;
	}
}

package employee;

public class Main {

	public static void main(String[] args) {
		Employee employee1=new Employee("Jason",26,30000,"Princeton");
		Employee employee2= new Employee("Alex",28,50000,"Texas");
		
		employee1.raiseSalary();
		System.out.println("My name is "+employee1.name+" and I am "+employee1.age+" years old and have a salary of "+employee1.salary+" working from "+employee1.location+" location");
		System.out.println("My name is "+employee2.name+" and I am "+employee2.age+" years old and have a salary of "+employee2.salary+" working from "+employee2.location+" location");
		

	}

}

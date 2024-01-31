package customer;

public class Customer {
   String custId;
   String name;
   String address;
   String phno;
   
   public Customer(String custId,String name)
   {
	   this.custId=custId;
	   this.name=name;
   }
   public Customer(String custId,String name,String address,String phno)
   {
	   this.custId=custId;
	   this.name=name;
	   this.address=address;
	   this.phno=phno;
   }
   
   public String getCustId()
   {
	   return custId;
   }
   public String getName()
   {
	   return name;
   }
   
   public String getAddress()
   {
	   return address;
   }
   
   public void setAddress(String address)
   {
	   this.address=address;
   }
   
   public String getPhno()
   {
	   return phno;
   }
   public void setPhno(String phno)
   {
	   this.phno=phno;
   }
   
   public class CustomerTest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Customer c= new Customer("AS78","Sneha");
			Customer c1=new Customer("ZX90","Swapna","HR NAGAR,BANGALORE,KARNATAKA,08045","900087678");
            c.setAddress("SILKBOARD,BANGALORE,78906");
            c.setPhno("1234567890");
            System.out.println(c.getName()+" "+c.getAddress()+" "+c.getCustId()+" "+c.getPhno());
            System.out.println(c1.getName());
	}
   }
}

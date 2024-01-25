package bankingapplicatin;

public class Bank {
 
	public static void main(String args[]) {
	
		BankAccount bankAccount = new  BankAccount("Daniel",50000);
	
	    bankAccount.withdraw();
	   // bankAccount.setBalance(0);
	   System.out.println(" The balance amount after withdrawing amount from bank account is "+ bankAccount.getBalance());
	   bankAccount.deposit();
	   System.out.println(" The balance amount after depositing amount in bank account is "+ bankAccount.getBalance());
	   
	}
	
}

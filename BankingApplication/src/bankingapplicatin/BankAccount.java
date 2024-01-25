package bankingapplicatin;

public class BankAccount {
   private String owner;
   private double balance;
   private final double WITHDRAWN_AMOUNT=3000;
   private final double DEPOSITED_AMOUNT=5000;
   
   public BankAccount(String owner,double balance) {
	   this.owner=owner;
	   this.balance=Math.max(balance, 0);
   }
   public void withdraw() {
	   System.out.println("Total amount withdrawn from bank account is "+WITHDRAWN_AMOUNT);
	   this.balance=balance - WITHDRAWN_AMOUNT;
   }
   public void deposit() {
	   System.out.println("Total amount deposited in bank account is "+ DEPOSITED_AMOUNT);
	   this.balance=balance + DEPOSITED_AMOUNT;
   }
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public double getBalance() {
	return this.balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
   
   
}

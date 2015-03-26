package Question1;
//James McGarr
public class SavingsAccount extends BankAccount{
	private String category;
	
	public SavingsAccount(){
		super();
		setCategory("SavingsAccount");
	}
	public SavingsAccount(String accNum, double balance){
		super(accNum,balance);
		setCategory("SavingsAccount");
	}
	@Override
	public void lodge(double amount)  {
		if (amount <= 0) throw new IllegalArgumentException("invalid lodgement ammount");
		setBalance(getBalance()+amount);
	}
	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount < 0) throw new IllegalArgumentException("you cannot withdraw that much");
		setBalance(getBalance()-amount);  
	}
	@Override
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String toString(){
		return "\nAccount Type: " + getCategory() +
	           super.toString() + "\n";
	}
}

package Question1;
//James McGarr
public class CurrentAccount extends BankAccount{
	private String category;
	
	public CurrentAccount(){
		super();
		setCategory("CurrentAccount");
	}
	public CurrentAccount(String accNum, double balance){
		super(accNum,balance);
		setCategory("CurrentAccount");
	}
	@Override
	public void lodge(double amount) {
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
	           super.toString();
	}
}

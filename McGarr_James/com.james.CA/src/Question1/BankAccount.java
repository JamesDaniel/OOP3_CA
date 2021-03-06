package Question1;
//James McGarr
public abstract class BankAccount implements Transactable, Comparable<BankAccount>{
	private String accNum;
	protected double balance;
	public BankAccount(){
		setAccNum(null);
		setBalance(0);
	}
	
	public BankAccount(String accNum, double balance)
	{
		setAccNum(accNum);
		setBalance(balance);
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public String toString(){
		return "\nAccount Number: " + getAccNum() + 
			   "\nBalance: �" + String.format("%.1f", getBalance());
	}
	public abstract String getCategory();
	public int compareTo(BankAccount otherBankAccount)
	{
		return getAccNum().compareTo(otherBankAccount.getAccNum());
	}
}

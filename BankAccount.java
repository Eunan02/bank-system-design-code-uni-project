package design;

public class BankAccount {

private byte id;
private double balance;

public void setID(byte id)
{
		this.id=id;
}
public void setBalance(double balance) {
	if (balance>0)//so can't add negatice value to balance
	this.balance+=balance;
}
public double getBalance() {return this.balance;}
public byte getId() {return this.id;}
}
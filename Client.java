package design;

public class Client {

private static short nextId=0;
private short id;
private Profile clientProfile;
private BankAccount[] accounts=new BankAccount[5];

//setters
public void setId()
{
	nextId++;
	if (nextId<=1000)
	this.id=nextId;//goes up one each time

}
public void setClientProfile(Profile clientProfile) {this.clientProfile=clientProfile;}
public void setAccounts(BankAccount account,int pos) 
{

if (pos<6 &&pos>0)//so can only be between 1 and 5 as each client can only have one account
{
	this.accounts[pos-1]=account;
	account.setID((byte)pos);
}
}

//getters
public short getId() {return this.id;}
public Profile getClientProfile() {return this.clientProfile;}
public BankAccount[] getAccounts() {return this.accounts;}
}

package design;
import java.util.Scanner;

public class UserInterface {
private static Client[] bankClients=new Client[1000];//array with the max number of clients allow

 void systemStartUp(short clientId)//useCase1
	{
	 //creating clients, will do this for every client in the bankClients array
	 Client client=null;
		client=new Client();
	bankClients[clientId-1]=client;
	bankClients[clientId-1].setId();
	}
	void presentingManagementOptions(short id) //useCase2
	{
		System.out.println("Ask for Client ID");
		System.out.println("Check Client ID");//placeholder for actual validation
		
		boolean error = false;
		
		if (error) {
			System.out.println("Print Error Message");
		}
		
		else {
			//showing all the management options
		System.out.println("Create Client Profile");
		System.out.println("Create Bank Account");
		System.out.println("Update Client Profile");
		System.out.println("Delete Bank Account");
		System.out.println("Transfer Money Between Accounts");
		System.out.println("Print Client Profile and Client Account Details");
		}

		
	}
	void createProfileOfClient(short id)//useCase3
	{
Profile clientProfile = bankClients[id].getClientProfile();
		
		if (clientProfile != null) {
			System.out.println("Print Error Message");//placeholder for error message when client profile has already been created
		}
		
		else {
			//placeholder for validation and input of profile
			System.out.println("Ask for First Name");
			System.out.println("Check First Name");
			System.out.println("Ask for Last Name");
			System.out.println("Check Last Name");
			System.out.println("Ask for Address");
			System.out.println("Check Address");
			System.out.println("Ask for Age");
			System.out.println("Check Age");
			
			bankClients[id].setClientProfile(clientProfile);
		}
		presentingManagementOptions(id);//returns client to management options

	}
	void updateProfileOfBankClient(short id)//useCase4
	{
		if (bankClients[id-1].getClientProfile()==null)
		{
			System.out.println("Print error message");//placeholder for error message for no client profile to update
		}else
			//placeholder for validation and input of updating profile
			System.out.println("Ask for address");
			System.out.println("Ask for Age");
			System.out.println("Check address");
			System.out.println("Check Age");
			boolean error=false;
			if (error) System.out.println("Print error message");//placeholder for any validation problems.
			else 
		System.out.println("Print Success Message");//placeholder for successful update
	}
	void createBankAccount(short id)//useCase5
	{
		
		System.out.println("Create Bank Account");
		System.out.println("Check that the client doesn't have the max number of accounts ");//placeholder for for loop which will check how many non null accounts the client has
		boolean maxNumberOfClients=false;
		if (maxNumberOfClients)	System.out.println("Print error message");//placeholder error message
		else
		{
		System.out.println();
		//placeholder for input and validation of creating an account
		System.out.println("Account Types");
		System.out.println("1)Basic Account Type");
		System.out.println("2)Premium Account Type");
		System.out.print("Chose Bank Account Type:");
		System.out.print("Enter balance for account");
		System.out.println("Check chosen Bank Account Type");
		System.out.println("check balance input");
		boolean error=false;
		if (error) System.out.println("Print error message");//placeholder error message
		else
		System.out.println("Print success message");//placeholder success message
		presentingManagementOptions(id);
	}
	}
	void deleteBankAccount(short clientID)//useCase6
	{
		System.out.println("Delete Bank Account");
		System.out.println();
		//placeholder for input and validation of deleting a bank account
		System.out.print("Enter the id of the bank Account:");
		System.out.println("Check id entered");
		boolean error=false;
		if (error) System.out.println("Print out error message");//placeholder error message
		else
			System.out.println("Print success message");//placeholder success message
		presentingManagementOptions(clientID);
	}
	void moneyTransfer(short clientID)//useCase7
	{
		System.out.println("Money Transfer");
		//placeholder for input and validation of money Transfer
		System.out.println("Ask for ID of Source Bank Account");
		System.out.println("Check ID of Source Bank Account");
		System.out.println("Ask for ID of Target Bank Account");
		System.out.println("Check ID of Target Bank Account");
		System.out.println("Ask for ID of Target Bank Client");
		System.out.println("Check ID of Source Bank Client");
		System.out.println("Ask for Amount to Transfer");
		
		boolean doesIdExist = true;
				
				if(doesIdExist !=true)
				{
					System.out.println("Print Error Message");//placeholder for error message if there is an incorrect id entered
				}
		
		boolean isBalanceEnough = true;
			
				if(isBalanceEnough !=false)
				{
				System.out.println("Print Error Message");//placeholder for error message when not enough money in account to transfer
				}
				
				else
				{
					System.out.println("Print Successful Transfer Message");//placeholder for successs transfer message
				}
				presentingManagementOptions(clientID);
	}
	

	
	void printClientDetails(short id)//useCase8and9
	{
		System.out.println("Client Details");
		System.out.println(bankClients[id-1].getClientProfile().getFirstName() + " " + bankClients[id-1].getClientProfile().getSecondName() + " " + bankClients[id-1].getClientProfile().getAddress() + " " + bankClients[id-1].getClientProfile().getAge());//print out all the users profile
	for (int x=0;x<bankClients[id-1].getAccounts().length;x++)
	{//placeholder for outputting and the client's bank accounts and checking if it's premium or basic
		System.out.println("check if there any null accounts");
		System.out.println("Check if account is basic or premium");
		System.out.println("Output BankAccountId and cash amount for each basic account");
		System.out.println("Output BankAccountId and balance, total cash back and fee for each basic account");
		
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Online Banking System***");
		UserInterface userInterface = new UserInterface();
		for (short i = 1; i < 1001; i++) {
			userInterface.systemStartUp((short)i);//this is done so all the client ids are initalised
		}
		System.out.println();
		System.out.println("Enter Client Id:");
		System.out.println("Check the provied client Id");//placeholder for checking if id exists
		short clientID=0;
		boolean doesIdExist=true;
		if (doesIdExist)
		userInterface.presentingManagementOptions(clientID);//this is used so the client then can chose the management options
		else
			System.out.println("Print out error message");//placeholder for error message if it doesn't exist
		
}
}

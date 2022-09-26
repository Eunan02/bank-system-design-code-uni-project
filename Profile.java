package design;

public class Profile {
private String firstName;
private String secondName;
private String address;
private short age;
//setters
public void setFirstName(String firstName)
{if (firstName != null)
	this.firstName=firstName;
}
public void setSecondName(String secondName) 
{ if(secondName!=null)
	this.secondName=secondName;
}
public void setAddress(String address) 
{ if (address !=null)
	this.address=address;
}
public void setAge(short age)
{ if (age>-1)
	this.age=age;
}

//getters
public String getFirstName() {return this.firstName;}
public String getSecondName() {return this.secondName;}
public String getAddress() {return this.address;}
public short getAge() {return this.age;}
}

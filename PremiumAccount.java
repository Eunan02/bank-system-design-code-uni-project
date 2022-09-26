package design;

public class PremiumAccount extends BankAccount {
private float fee;
private double cashback;

//setters
public void setFee(float fee) {this.fee=fee;}
public void setCashback(double cashback) {this.cashback=cashback;}

//getters
public float getFee(){return this.fee;}
public double getCashback() {return this.cashback;}
}

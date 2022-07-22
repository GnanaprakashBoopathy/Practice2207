package org.bank;

public class BankInfo extends AxisBank {
private void saving() {
System.out.println("Axis Bank Savings Account");
}
private void fixed() {
System.out.println("Axis Bank Fixed Deposit");
}
@Override
	public void deposit() {
	System.out.println("Axis bank deposit 2");
	super.deposit();
	}
public static void main(String[] args) {
	BankInfo a=new BankInfo();
	a.saving();
	a.fixed();
	a.deposit();
}
}

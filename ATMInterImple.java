package com.atm;

public class ATMInterImple implements ATMInterface {

	ATM atm=new ATM();
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available Balance is " + atm.getBalance());
	}

	@Override
	public void withdrawBalance(double withdrawBalance) {
		// TODO Auto-generated method stub
		if( withdrawBalance<=atm.getBalance()) {
			System.out.println("Collect the case!");
			atm.setBalance(atm.getBalance()- withdrawBalance);
			viewBalance();
		}
		else {
			System.out.println("Insufficiebt Balance");
		}
		
	}

	@Override
	public void depositBalance(double depositAmount) {
		// TODO Auto-generated method stub
		atm.setBalance(depositAmount + atm.getBalance());
		viewBalance();
	}

	
    
}

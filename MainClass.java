package com.atm;

import java.util.Scanner;

public class MainClass {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   ATMInterface op=new ATMInterImple();
		   while(true) {
			   System.out.println(" 1.View Available Balance \n2.Withdraw Amount \n3.Deposit Amount \n4.Exit");
			   System.out.println("Enter your choice");
			   int ch=sc.nextInt();
			   if(ch==1) {
				   op.viewBalance();
			   }
			   else if(ch==2) {
				   System.out.println("Enter amount to withdraw : ");
			       double withdrawAmount=sc.nextDouble();
			       op.depositBalance(withdrawAmount);
			   }
			   else if(ch==3) {
				   System.out.println("Enter amount to deposit : ");
			       double depositAmount=sc.nextDouble();
			       op.depositBalance(depositAmount);
			   }
			   
			   else if(ch==4) {
				   System.out.println("Collect your ATM Card\n Thank you for ATM Machine  ");
				   break;
				   
			   }
			   else {
				   System.out.println("Plz enter correct choice!!");
			   }
			   
		   }
	   
	   
   }
}

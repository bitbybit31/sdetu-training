package oop;

public class BankAccountApp {
	
	public static void main(String[] args) {
		// Create a new bank account >> think instantiate an object
		
		bankaccount acc1 = new bankaccount();
		acc1.accountNumber = "0897497";
		
		// acc1.name = "Roger Hue";
		// With Encapsulation : public API methods
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("3297429649");
		System.out.println("SSN: " + acc1.getSsn());
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		
		// Polymorphism through Overriding
		System.out.println(acc1.toString());
		
		
		// Polymorphism through Overloading
		bankaccount acc2 = new bankaccount("Checking Account");
		acc1.accountNumber = "0897497";
		
		bankaccount acc3 = new bankaccount("Savings Account", 5000);
		acc3.accountNumber = "0897497";
		
		/*
		acc3.checkBalance();
		
		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		
		*/
		
		}

}

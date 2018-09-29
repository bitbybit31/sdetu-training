package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setAmmortSchedule();
		la.serTerm(20);

		// Polymorphism changes where are pointing
		IRate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate();
	}

}

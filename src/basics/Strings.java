package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "NFL QB";
		bookTitle = "Hall of Fame NFL QB, Dan Marino";

		if (bookTitle.contains("NFL QB")) {
			System.out.println(wordChoice);
}
	
	String browser = "Dolphins"; 
	if (browser.equalsIgnoreCase("dolphins")) {
		System.out.println("The team is dolphins");
	}
	
	String firstName = "Dan";
	String lastName = "Marino";
	String number = "13867";
	
	System.out.println("He wore " + number + " for Miami.");
	
	// Print first name initial, last name initial and jersey number
	System.out.print(firstName.substring(0, 1));
	System.out.print(lastName.substring(0,1));
	System.out.println(number.substring(0,2));
		
}
	}
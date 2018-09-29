package basics;

public class Weather {
	public static void main(String[] args) {
		// This program will give suggestions of what to wear based on the weather (temperature and sun condition)
		
		int temperature = 96;
		String sunCondition = "Sunny";
		
		if ((temperature > 80) && (temperature < 95)) {
			System.out.println("It's pleseant. Wear shorts and t-shirt");
		}
		
		else if ((temperature > 95 ) && (sunCondition == "Sunny")) {
			System.out.println("It's very hot, might as well stay home in the air conditioner");
			
		}
		System.out.println("The program is ending.");
	}
	
	
}

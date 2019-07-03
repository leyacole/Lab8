import java.util.Scanner;
import java.util.InputMismatchException;

public class InfoArray {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		boolean isValid = true;
		String choice = "y";
		int index = 0;
	
		
		String[] names = new String[10];
				
		names[0] = "Michael";
		names[1] = "Lisa";
		names[2] = "Paul";
		names[3] = "Alexis";
		names[4] = "Kayla";
		names[5] = "Thelma";
		names[6] = "Scott";
		names[7] = "Jane";
		names[8] = "Mary";
		names[9] = "Jackie";
		
		String[] food = new String[10];
		
		food[0] = "hamburgers";
		food[1] = "cheeseburgers";
		food[2] = "chili";
		food[3] = "seafood";
		food[4] = "hotdogs";
		food[5] = "tuna fish";
		food[6] = "chicken";
		food[7] = "ribs";
		food[8] = "eggs";
		food[9] = "ice cream";
		
		String[] hometown = new String[10];
		
		hometown[0] = "Detroit";
		hometown[1] = "Novi";
		hometown[2] = "Detroit";
		hometown[3] = "Boston";
		hometown[4] = "Chicago";
		hometown[5] = "Detroit";
		hometown[6] = "New York";
		hometown[7] = "Florida";
		hometown[8] = "Houston";
		hometown[9] = "Dallas";
		
		
		System.out.println("Welcome to our Java class.");
		while(choice.startsWith("y")) {
			
			do {
			System.out.println("Which student would you like to learn more about? (enter a number 1-10): ");
			
			//show entire list of names
			for (int i = 0; i < names.length; i++) {
				System.out.println(i + 1 +". " + names[i]);
			}
			
			index = scnr.nextInt() - 1;
				
					while(index < 0 || index >= 10) {
					System.out.println("Invalid number entered. Try again with 1 - 10");
					index = scnr.nextInt() - 1;
				}
				
			isValid = false;
			}while(isValid);
			
		System.out.println();
		
		scnr.nextLine();
	
		System.out.println("That is " + names[index] + ". What would you like to know about "+names[index] + "? (enter \"hometown\" or \"favorite food\")");
        
       	String input = scnr.nextLine(); //getting input for home town or favorite food.
		
		do {
			
			if(input.equalsIgnoreCase("hometown")){
				System.out.println(names[index] +" is from " + hometown[index]);
				System.out.println("Would you like to know more? (enter \"yes\" or \"no\")");
				input = scnr.nextLine();
					
					if(input.toLowerCase().charAt(0) == 'y'){
						System.out.println(names[index] + " likes " + food[index]);
						break;
					}
					else {
						System.out.println("Thanks");
						break;
						
					}
			
			}else if(input.equalsIgnoreCase("favorite food")) {
				System.out.println(names[index] + " likes " + food[index]);
				System.out.println("Would you like to know more? (enter \"yes\" or \"no\")");
				input = scnr.nextLine();
				
				if(input.toLowerCase().charAt(0) == 'y'){
					System.out.println(names[index] + " is from " + hometown[index]);
					break;
				}
				else {
					System.out.println("Thanks ");
					break;
				}
			}else {
				System.out.println("Error! Enter \"hometown\"" + " or \" favorite food" );
				 input = scnr.nextLine();
				
			}
			
						
		}while(isValid);
		
		System.out.println("Would you like to know about another person? (y/n)");
		choice =scnr.nextLine();
		}
		System.out.println("Bye");
		
		scnr.close();
	}
	
}

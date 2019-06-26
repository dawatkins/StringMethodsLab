import java.util.Scanner;

public class StringLab {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput;
		String userInput2;
		
		//Capitalize method caller
		System.out.println("Enter a word to be capitalized: ");
		userInput = scnr.nextLine();
		System.out.println(StringMethods.capitalize(userInput));
		
		//Wheres Waldo method caller
		System.out.println(StringMethods.wheresWaldo("Striped Waldo!"));
		
		//firstThingsFirst method calller
		System.out.println("Enter a word: ");
		userInput = scnr.nextLine();
		System.out.println("Enter a second word: ");
		userInput2 = scnr.nextLine();
		System.out.println("Alphabetical order: " + StringMethods.firstThingsFirst(userInput, userInput2));
		
		//reverse method caller
		System.out.println("Enter a string to be printed in reverse: ");
		userInput = scnr.nextLine();
		System.out.print(StringMethods.reverse(userInput));
		
		System.out.println();
		
		//soLong method caller
		System.out.println("Enter a word to compare lengths:");
		userInput = scnr.nextLine();
		System.out.println("Enter the word to compare to: ");
		userInput2 = scnr.nextLine();
		StringMethods.soLong(userInput, userInput2);
		
		//afterMath method caller
		System.out.println(StringMethods.afterMath("She aced the mathematics test!"));
		System.out.println(StringMethods.afterMath("My floor mat is so keen!"));
		
		//letterize method caller
		System.out.println("Enter a string to be letterized!");
		userInput = scnr.nextLine();
		StringMethods.letterize(userInput);
		
		scnr.close();
	}
}

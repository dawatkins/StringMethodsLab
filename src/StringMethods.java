
public class StringMethods {

	public static String capitalize(String word) {
		word = word.toLowerCase();
		String first = word.substring(0, 1).toUpperCase();
		String rest = word.substring(1).toLowerCase();
		//System.out.println(first + rest);
		word = first + rest;
		return word;
	}
	
	public static int wheresWaldo(String phrase) {
		//System.out.println(phrase.indexOf("Waldo"));
		return phrase.indexOf("Waldo");
	}
	
	public static String firstThingsFirst(String a, String b) {
		if (a.charAt(0) < b.charAt(0)) {
			//System.out.println(a + " " + b);
			return (a + " " + b);
		} else {
			//System.out.println(b + " " + a);
			return (b + " " + a);
		}
		
	}
	
	public static String reverse(String s) {
		StringBuilder input = new StringBuilder();
		input.append(s);
		s = input.reverse().toString();
		return s;
	}
	
	public static void soLong(String a, String b) {
		if(a.length() == (b.length())){
			System.out.println(a + " " + b);
		}else if(a.length() > b.length()){
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}
	
	public static String afterMath(String phrase) {
		int phraseIndex = phrase.indexOf("math");
		if(phraseIndex > 0) {
			//System.out.println(phrase.substring(phraseIndex));
			phrase = phrase.substring(phraseIndex);
			return phrase;
		} else {
			//System.out.println("dud");
			phrase = "dud";
			return phrase;
		}
	}
	
	public static void letterize(String word) {
		for(int i = 0 ; i <= word.length() - 1; i++) {
			System.out.println(word.charAt(i));
		}
	}
	
	public static void camelCase(String phrase) {
		
	}

}

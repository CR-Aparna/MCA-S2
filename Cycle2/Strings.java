public class Strings {
	public static void main(String[] args) {
		String text = "Object Oriented Programming";
		System.out.println("Original Text: " + text);
		System.out.println("\nThe given text is empty->" + text.isEmpty());
		System.out.println("\nLength of the given text:" + text.length());
		System.out.println("To Upper Case:" + text.toUpperCase());
		System.out.println("To Lower Case:" + text.toLowerCase());
		System.out.println("\nSubstring: " + text.substring(7));
		System.out.println("\nReplace O with $:" + text.replace('O', '$'));
		System.out.println("\nReplace first word :" + text.replaceFirst("Object", "Java"));
	}

}

/*
 * Original Text: Object Oriented Programming
 * 
 * The given text is empty->false
 * 
 * Length of the given text:27
 * To Upper Case:OBJECT ORIENTED PROGRAMMING
 * To Lower Case:object oriented programming
 * 
 * Substring: Oriented Programming
 * 
 * Replace O with $:$bject $riented Programming
 * 
 * Replace first word :Java Oriented Programming
 */

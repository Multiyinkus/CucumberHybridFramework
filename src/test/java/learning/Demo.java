package learning;

import java.util.regex.Pattern;
      //4hrs 01min on video
public class Demo {

	public static void main(String[] args) {

		boolean matchingStatus = Pattern.matches("[Jj]ava", "java");
		if(matchingStatus) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
		
		boolean matchingStatus2 = Pattern.matches("ye[sp]", "yes");//means last letter can only be s or p
		if(matchingStatus2) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
		
		boolean matchingStatus3 = Pattern.matches("[sfk]it", "sit");//means first letter can only be s,f or k
		if(matchingStatus3) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
		
		boolean matchingStatus4 = Pattern.matches(".ava", "java");//. means the letter can be anything
		if(matchingStatus4) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
		
		boolean matchingStatus5 = Pattern.matches("[0-9]am", "5am");//means it can only be number between 0 to 9
		if(matchingStatus5) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
		
		boolean matchingStatus6 = Pattern.matches("[a-z]et", "jet");//means it can only be btw a to z in lowercase
		if(matchingStatus6) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
		
		boolean matchingStatus7 = Pattern.matches("[a-zA-Z0-9]et", "jet");//means first letter can be a to z,A to Z or 0 to 9 but can't contain a character
		if(matchingStatus7) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
			
		boolean matchingStatus8 = Pattern.matches("[^0-9]et", "set");// ^ means first letter cant be between 0 to 9
		if(matchingStatus8) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
		
		boolean matchingStatus9 = Pattern.matches("se[a-z]", "set");//means last letter can only be lowercase a to z
		if(matchingStatus9) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
		
		boolean matchingStatus10 = Pattern.matches("s[^aeiou]t", "s9t");// ^ means it cant be a,e,i,o,u
		if(matchingStatus10) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
		
		boolean matchingStatus11 = Pattern.matches("\\dam", "java");// \\d first letter can be 0-9
		if(matchingStatus11) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
		
		// \D means the same as [^0-9] meaning it cant be 0 to 9
		// \w means matches single word character and is equal to specifying [A-Za-z0-9_]
		// \W means matches single non-word character and is equal to specifying [^A-Za-z0-9_]
		// \s means matches with any escape characters say \t \n \f \r
		// \S
		// ^My start with
		// \

	}

}

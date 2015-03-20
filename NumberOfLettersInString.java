package homework2;

import java.util.Scanner;

public class NumberOfLettersInString {
/* 
Write a program that prompts the user to enter a string 
and displays the number of letters in the string.
The signature of method is public static int countLetters(String s). 
**/
	public static void main(String[] args) 
	{
		
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter the string: ");
		    String string = input.nextLine();
		    input.close();
		    System.out.println("The number of letters of " + string +" is " 
		    + countLetters(string));
	}

		  public static int countLetters(String s) {
		    int numberOfLetters = 0;
		    for (int i = 0; i < s.length(); i++) {
		    	
//		    	System.out.println("s.charAt(i) " + s.charAt(i));
//		    	System.out.println("isLetter(s.charAt(i)) " + Character.isLetter(s.charAt(i)));
//		    	System.out.println("isDigit(s.charAt(i)) " + Character.isDigit(s.charAt(i)));
		    	
		    	if (Character.isLetter(s.charAt(i))) {
		        numberOfLetters++;
		      }
		    }
		    return numberOfLetters;
		  }
				
}


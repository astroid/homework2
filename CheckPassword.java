package homework2;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a password and checks whether
 * a string is a valid password. The program displays Valid Password if the
 * rules are followed or Invalid Password otherwise. The signature of method is
 * public static boolean isValidPassword(String s). Suppose the password rules
 * are as follows:
 * 
 * A password must have at least eight characters. A password consists of only
 * letters and digits. A password must contain at least two digits.
 */
public class CheckPassword {

	// import java.io.PrintStream;
	// import java.util.Scanner;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the password: ");
		String password = input.nextLine();
		input.close();
		System.out.println(isValidPassword(password) ? "Valid password"
				: "Invalid password");
		// if (isValidPassword(password)) {
		// 	System.out.println("Valid password");
		// } else
		// 	System.out.println("Invalid password");
	}

	public static boolean isValidPassword(String s) {
		// checking : it must have at least eight characters
		if (s.length() < 8) {
			return false;
		}
		// checking: it consists of only letters and digits.
		for (int i = 0; i < s.length(); i++) {
			if ((!Character.isLetter(s.charAt(i)))
					&& (!Character.isDigit(s.charAt(i)))) {
				return false;
			}
		}

		// must contain at least two digits.
		int numberOfDigits = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				numberOfDigits++;
			}
		}
		if (numberOfDigits >= 2) {
			return true;
		}
		return false;
	}
}
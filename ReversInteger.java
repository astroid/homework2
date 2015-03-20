package homework2;
/** 
Write a program that prompts user to enter an integer 
and displays its reversal. It should have method that 
reverses the digits of an integer.
Example: reverse(3456) displays 6543. 
Signature of method is public static void reverse(int number)
*/
import java.util.Scanner;

public class ReversInteger {

	public static void main(String[] args) {
		System.out.print("Enter an integer number: ");
		Scanner input = new Scanner(System.in);
		int integerNumber = input.nextInt();
		input.close();
		reverse(integerNumber);
	}

	public static void reverse(int number) {
		while (number != 0) {
			int rightNumber = number % 10;
			System.out.print(rightNumber);
			number = number / 10;
		}
	}
}

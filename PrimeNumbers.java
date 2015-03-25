package homework2;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of your requested prime numbers :");
		int userNumber = input.nextInt();
		input.close();
		printPrimeNumbers(userNumber);
	}

	public static void printPrimeNumbers(int numberOfPrimes) {
		final int PRIME_NUMBERS_PER_LINE = 10;
		int numberOfPrimeNumber = 0;
		int number = 2;

		while (numberOfPrimeNumber < numberOfPrimes) {

			if (isPrime(number)) {
				numberOfPrimeNumber++; 
				if (numberOfPrimeNumber % PRIME_NUMBERS_PER_LINE == 0) {
					System.out.printf("%-10s\n", number);
				} else
					System.out.printf("%-10s", number);
			}
			number++;
		}
	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}

		return true; 
	}
}
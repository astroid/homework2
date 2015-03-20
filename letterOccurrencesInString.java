package homework2;

/**
 * Write a program that prompts the user to enter a string and a character and
 * displays the number of occurrences for the character in the string using
 * recursion.The signature of recursive method is public static int count(String
 * str, char a). For example, count("Welcome", 'e') returns 2.
 * */
public class letterOccurrencesInString 
{
	public static void main(String[] args) 
	{
		System.out.println(count("Welcome", 'e'));
	}

	public static int count(String str, char a) 
	{
		int occurrence = 0;
		if (str.length() > 0) 
		{
			if (str.charAt(0) == a) {
				occurrence = count(str.substring(1), a) + 1;
			} else
				occurrence = count(str.substring(1), a);
		}
		return occurrence;
	}
}

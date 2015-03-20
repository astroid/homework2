package homework2;
/** Write a program that causes the JVM to throw an OutOfMemoryError and 
* catches and handles this error.
*/
public class JvmThorwOutOfMemery {

	public static void main(String[] args) {
		try {

			int[] myList = new int[Integer.MAX_VALUE];

			for (int i = 0; i < myList.length; ++i)
				myList[i] = i + 1;

		} catch (Error ex) {
			
			ex.printStackTrace();
			System.out.println("You are running out of memory.");
		}
	}
}

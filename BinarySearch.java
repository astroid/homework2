package homework2;
/**
 * Rewrite BinarySearch program using recursion.
 * ""https://github.com/SFX-IT/JavaBeginners/blob
 * 	/master/feb26/search/BinarySearch.java""
 * homework 27Feb2015
 * by Mehdi
 * */

public class BinarySearch {
	public static int recursiveBinarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		return recursiveBinarySearch(arr, key, low, high);
	}

	public static int recursiveBinarySearch(int[] arr, int key, int low,
			int high) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (key < arr[mid])
			return recursiveBinarySearch(arr, key, low, mid - 1);
		else if (key == arr[mid])
			return mid;
		else
			return recursiveBinarySearch(arr, key, mid + 1, high);
	}

	public static void main(String[] args) {
		int[] list = { 1, 2, 3, 5, 6, 9 };
		for (int i = 0; i < 10; i++) {
			if (recursiveBinarySearch(list, i) == -1)
				System.out.println(i + " is not in array");
			else
				System.out.println(i + " is located at index "
						+ recursiveBinarySearch(list, i));
		}
	}
}
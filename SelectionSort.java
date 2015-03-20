package homework2;


public class SelectionSort {

	public static void main(String[] args) {
		double[] list = { 1, 9, 4.5, 6.6, 5.7, -4.5 };
		SelectionSort.selectionSort(list);
		for (double i : list) {
			System.out.print(i + " ");
		}
	}

	  public static void selectionSort(double[] arr)
	  {
	    for (int i = 0; i < arr.length; i++)
	    {
	      double currentMax = arr[i];
	      int currentMaxIndex = i;

	      for (int j = i + 1; j < arr.length; j++) {
	        if (currentMax < arr[j]) {
	          currentMax = arr[j];
	          currentMaxIndex = j;
	        }

	      }

	      if (currentMaxIndex != i) {
	        arr[currentMaxIndex] = arr[i];
	        arr[i] = currentMax;
	      }
	    }
	  }
}


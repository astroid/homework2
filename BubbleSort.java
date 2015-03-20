package homework2;

import java.util.Scanner;
/**
 * Write a program with sort method for double that uses the bubble-sort
 * algorithm. The bubblesort algorithm makes several passes through 
 * the array. On each pass, successive neighboring pairs are compared. If a pair is not in order, 
 * its values are swapped; otherwise, the values remain unchanged. 
 * 27Feb2015
 * by MEHDI */
public class BubbleSort {

  public static void main(String[] args)
  {
	  System.out.println("Enter the numbers of the member of the list");
	  Scanner input = new Scanner(System.in);
	  int arrayLenght = input.nextInt();
	  
	  double[] myArray = new double[arrayLenght];
	  System.out.println("Enter " + arrayLenght +" numbers: ");
		for (int i = 0; i < myArray.length; i++) 
		{
			myArray[i] = input.nextDouble();
		}
	input.close();
    bubbleSort(myArray);

    System.out.println("The sorted list is: ");
    for (int i = 0; i < myArray.length; i++)
        System.out.print(myArray[i] + "  ");
  }
  static void bubbleSort(double[] list) {
	    boolean swaped = true;
	    do {
	      swaped = false;
	      for (int j = 0; j < list.length - 1; j++)
	        if (list[j] > list[(j + 1)])
	        {
	          double temp = list[j];
	          list[j] = list[(j + 1)];
	          list[(j + 1)] = temp;
	          swaped = true;
	        }
	    }
	    while (swaped);
	  }
}



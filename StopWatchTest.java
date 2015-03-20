package homework2;

class StopWatchTest {
	/**
	 * (StopWatch) Design a class named StopWatch. The class contains: ■ Private
	 * data fields startTime and endTime with getter methods. ■ A no-arg
	 * constructor that initializes startTime with the current time. ■ A method
	 * named start() that resets the startTime to the current time. ■ A method
	 * named stop() that sets the endTime to the current time. ■ A method named
	 * getElapsedTime() that returns the elapsed time for the
	 * 
	 * */

	public static class StopWatch {

		private long startTime;
		private long endTime;

		public StopWatch() {
			reset();
		}

		public void start() {
			startTime = System.currentTimeMillis();
		}

		public void stop() {
			endTime = System.currentTimeMillis();
		}

		public long getElapsedTime() {
			return (endTime - startTime);
		}

		public void reset() {
			startTime = System.currentTimeMillis();
		}
	}
	public static void main(String[] args) {
		StopWatch stopWatch1 = new StopWatch();
		stopWatch1.start();
		
		double[] myList = new double[100000];
		
			for (int i = 0; i < 99999; i++) 
			{
				myList[i] = (double) Math.random() * 100;
			}
			SelectionSort.selectionSort(myList);
			System.out.println(myList[2]);
		stopWatch1.stop();
		System.out.println(stopWatch1.getElapsedTime() + " milliseconds");
	}

}

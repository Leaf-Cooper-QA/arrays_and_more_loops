package arraysForLoops;

public class Arrays1 {
	public static void main(String[] args) {
		createarray();
		createarray2();
	}

	private static void createarray2() {
		int [] morenumbers = new int[10];
		for (int i=0; i < 10 ; i++) {
			morenumbers[i] = i;
			System.out.println(morenumbers[i]);
		}
		for (int number : morenumbers) {
			number = number*10;
			System.out.println(number);
		}
		
	}

	private static void createarray() {
		int [] numbers = {3,14,15,9,2,65,3,5,413,0};
		for (int number : numbers) {
			System.out.println(number);
		}
		
	}

}

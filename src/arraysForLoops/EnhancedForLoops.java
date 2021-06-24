package arraysForLoops;

public class EnhancedForLoops {
	public static void main(String[] args) {
		task1();
		task2();
		System.out.println(task3(7));
		System.out.println(task3(24));
		task4();
	}

	private static void task4() {
		// TODO Auto-generated method stub
		int [] squares = new int[20];
		for(int i = 0;i<20;i++) {
			squares[i]=i+1;
		}
		for(int square : squares) {
			if (task3(square)) {
				System.out.println(square*square*square);
			} else {
				System.out.println(square*square);
			}
		}
	}

	private static boolean task3(int i) {
		if (i%2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	private static void task2() {
		int [] squares = new int[20];
		for(int i = 0;i<20;i++) {
			squares[i]=i+1;
		}
		for (int square : squares) {
			System.out.println(square*square);
		}
		
		
	}

	private static void task1() {
		String [] words = {"This","is","a","list","of","words"};
		for(String word : words) {
			System.out.println(word);
		}
		
	}

}

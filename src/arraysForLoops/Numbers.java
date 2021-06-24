package arraysForLoops;

public class Numbers {
	public static void main(String[] args) {
		System.out.println(task1(39));
		System.out.println(task2(74));
		System.out.println(task2(15));
		System.out.println(task2(90));
		System.out.println(task2(413));
		System.out.println(task2(4269));
		revisted();
	}

	private static void revisted() {
		// TODO Auto-generated method stub
		for (int i=1; i<=100 ; i++) {
			System.out.println(task2(i));
		}
	}

	private static String task2(int i) {
		// TODO Auto-generated method stub
		String[] first19 = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] tens = {"twenty","thirty","forty","fifty","fifty","sixty","seventy","eighty","ninety"};
		String a = "";
		String b = "";
		String c = "";
		String d = "";
		if (i%100 <= 19) {
			a = first19[i%100] + " ";
			if (i >= 100) {
				c = first19[((i-(i%100))/100)%10] + " hundred ";
			}
			if (i >= 1000) {
				d = first19[((i-(i%1000))/1000)] + " thousand ";
			}
		} else {
			a = first19[(i%10)] + " ";
			b = tens[(((i-(i%10))/10)%10%10)-1] + " ";
			if (i >= 100) {
				c = first19[((i-(i%100))/100)%10] + " hundred ";
			}
			if (i >= 1000) {
				d = first19[((i-(i%1000))/1000)] + " thousand ";
			}
		}
		return(d + c + b + a);

		
	}

	private static int task1(int i) {
		// TODO Auto-generated method stub
		int a = i%10;
		int b = (i-a)/10;
		return b+a;
	}

}

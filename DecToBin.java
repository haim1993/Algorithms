
public class DecToBin {
	
	static int counter = 1;
	
	//--Recursion. Decimal --> Binary
	public static int decToBinRecursion(int num) {
		if (num < 2) 
			return num * counter;
		counter *= 10;
		return decToBinRecursion(num / 2) + ((counter /= 10) * (num % 2));
	}

	//--Iteration. Decimal --> Binary
	public static int decToBinIteration(int num) {
		int binary = 0, counter = 1;
		while (num != 0) {
			binary = binary + (num % 2) * counter;
			counter *= 10;
			num /= 2;
		}
		return binary;
	}

	public static void main(String[] args) {

		int num = 128;
		System.out.println("Iteration : " + num + " in binary " + decToBinIteration(num));
		System.out.println("Recustion : " + num + " in binary " + decToBinRecursion(num));
	}

}

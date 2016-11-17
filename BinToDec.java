
public class BinToDec {
	
	static int power = 0;
	
	//--Recursion. Binary --> Decimal
	public static int binToDecRecursion(int num) {
		if (num < 10) 
			return (int) (Math.pow(2, power) * num);
		power++;
		return binToDecRecursion(num / 10) + (int) Math.pow(2, --power) * (num % 10);
	}

	//--Iteration. Binary --> Decimal
	public static int binToDecIteration(int num) {
		int decimal = 0, power = 0;
		while (num != 0) {
			decimal = decimal + (int) ((num % 10) * Math.pow(2, power++));
			num = num / 10;
		}
		return decimal;
	}

	public static void main(String[] args) {

		int num = 1101;
		System.out.println("Iteration : " + num + " in decimal " + binToDecIteration(num));
		System.out.println("Recustion : " + num + " in decimal " + binToDecRecursion(num));
	}

}

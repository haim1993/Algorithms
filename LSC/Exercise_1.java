
public class Exercise_1 {

	/* Greedy Algorithym. Complexity O(n*m)
	 * n = Length of 'str1'
	 * m = Length of 'str2' */
	public static String greedy(String str1, String str2) {
		String ans = "";
		int index = 0;
		for (int i = 0; i < str1.length(); i++) {
			for (int j = index; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					ans += str1.charAt(i);
					i++;
					index = j + 1;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		String str1 = "abcade";
		String str2 = "aebdc";
		System.out.println("Greedy LCS : " + greedy(str1, str2));

	}

}

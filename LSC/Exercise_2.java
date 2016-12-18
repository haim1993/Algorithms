
public class Exercise_2 {

	public static String improvedGreedy(String str1, String str2) {
		int[] freq = new int[26];
		for (int i = 0; i < str2.length(); i++) {
			int place = (str2.charAt(i) - 'a');
			freq[place]++;
		}
		String ans = "";
		int start = 0;
		for (int i = 0; i < str1.length(); i++) {
			int place = (str1.charAt(i) - 'a');
			if (freq[place] > 0) {
				int index = str2.indexOf(str1.charAt(i), start);
				if (index > -1) {
					ans += str1.charAt(i);
					start = index + 1;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		String str1 = "abcade";
		String str2 = "aebdc";
		System.out.println("Improved Greedy LCS : " + improvedGreedy(str1, str2));

	}

}

import java.util.Vector;

public class Exercise_3 {

	/* Whole Search for LCS. Complexity O(2^(n+m)*min(n,m))
	 * n = length of 'str1'
	   m = length of 'str2' */
	public static String wholeSearch(String str1, String str2) {
		Vector<String> v1 = getAllSubStrings(str1);
		Vector<String> v2 = getAllSubStrings(str2);
		String lcs = "";
		for (String s1 : v1) {
			for (String s2 : v2) {
				if (s1.equals(s2))
					if (s1.length() > lcs.length()) lcs = s1;
			}
		}
		return lcs;
	}
	
	public static Vector<String> getAllSubStrings(String str) {
		Vector<String> result = new Vector<String>();
		int size = result.size();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < size; j++) {
				result.addElement(result.elementAt(j) + str.charAt(i));
			}
			result.addElement(str.charAt(i) + "");
			size = result.size();
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		String str1 = "abcade";
		String str2 = "aebdc";
		System.out.println("Whole Search LCS : " + wholeSearch(str1, str2));
	}

}

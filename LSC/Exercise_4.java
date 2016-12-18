
public class Exersice_4 {
	
	/*
	 * Dynamic LCS. Complexity O(n*m).
	 * n = size of 'str1'
	 * m = size of 'str2'
	 * Return : Size of the longest LCS
	 */
	public static int LCS(String str1, String str2) {
		int[][] matrix = new int[str1.length() + 1][str2.length() + 1];
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[i].length; j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1))
					matrix[i][j] = matrix[i - 1][j - 1] + 1;
				else
					matrix[i][j] = Math.max(matrix[i][j - 1], matrix[i - 1][j]);
			}
		}
		return matrix[matrix.length - 1][matrix[0].length - 1];
	}
	
	public static void main(String[] args) {
		
		String str1 = "abcade";
		String str2 = "aebdc";
		
		System.out.println("LCS : " + LCS(str1, str2));
	}

}

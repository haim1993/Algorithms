
public class Exercise_5 {

	/*
	 * Dynamic LCS. Complexity O(n*m).
	 * n = size of 'str1'
	 * m = size of 'str2'
	 * Return : The longest LCS String.
	 */
	public static String LCS(String str1, String str2) {
		int[][] matrix = new int[str1.length() + 1][str2.length() + 1];
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[i].length; j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1))
					matrix[i][j] = matrix[i - 1][j - 1] + 1;
				else
					matrix[i][j] = Math.max(matrix[i][j - 1], matrix[i - 1][j]);
			}
		}
		int rows = matrix.length - 1, cols = matrix[0].length - 1;
		int str1_length = str1.length() - 1, str2_length = str2.length() - 1;
		int maxLCS = matrix[rows][cols];
		int i = 0, j = 0;
		String ans = "";
			
		while (maxLCS != 0) {
			if (str1.charAt(str1_length - i) == str2.charAt(str2_length - j)) {
				ans += str1.charAt(str1_length - i);
				i++;
				j++;
				maxLCS--;
			}
			else {
				if (matrix[rows - 1 - i][cols - j] > matrix[rows - i][cols - 1 - j]) 
					i++;
				else
					j++;
			}
		}
		String temp = "";
		for (int k = ans.length() - 1; k >= 0; k--) {
			temp += ans.charAt(k);
		}
		return temp;
	}
	
	public static void main(String[] args) {
		
		String str1 = "giehrweogi";
		String str2 = "gerihiowegi";
		
		System.out.println("LCS : " + LCS(str1, str2));
	}

}

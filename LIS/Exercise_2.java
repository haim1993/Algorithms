import java.util.Vector;

public class Exercise_2 {

	/*
	 * Returns the greedy LIS. Complexity O(n).
	 * n = the length of the given array.
	 */
	public static Vector<Integer> greedyLIS(int[] arr, int i) {
		Vector<Integer> vector = new Vector<Integer>();
		vector.addElement(arr[i]);
		for (i = i + 1; i < arr.length; i++) {
			if (vector.lastElement() < arr[i])
				vector.addElement(arr[i]);	
		}
		return vector;
	}
	
	/*
	 * Returns the improved greedy LIS. Complexity O(n^2).
	 * n = the length of the given array.
	 * It chooses the selected element in the array and from there
	 * calculates the greedyLIS (O(n)).
	 */
	public static Vector<Integer> improvedGreedyLIS(int[] array) {
		Vector<Integer> ans = new Vector<Integer>();
		int maxLIS = 0;
		for (int i = 0; i < array.length; i++) {
			Vector<Integer> temp = greedyLIS(array, i);
			if (temp.size() > maxLIS) {
				maxLIS = temp.size();
				ans = temp;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] array = {1,100,101,2,3,4,5,6,7};
		System.out.println("Improved Greedy LIS : " + improvedGreedyLIS(array).toString());

	}

}

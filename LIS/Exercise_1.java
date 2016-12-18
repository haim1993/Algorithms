import java.util.Vector;

public class Exercise_1 {

	/*
	 * Returns the greedy LIS. Complexity O(n).
	 * n = the length of the given array.
	 */
	public static Vector<Integer> greedyLIS(int[] arr) {
		Vector<Integer> vector = new Vector<Integer>();
		vector.addElement(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (vector.lastElement() < arr[i])
				vector.addElement(arr[i]);	
		}
		return vector;
	}

	public static void main(String[] args) {
		
		int[] array = {1,100,101,2,3,4,5,6,7};
		System.out.println("Greedy LIS : " + greedyLIS(array).toString());
		
	}

}

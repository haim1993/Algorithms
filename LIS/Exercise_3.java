import java.util.Vector;

public class Exercise_3 {

	/*
	 * Return all the vector that contains the largest LIS.
	 * Complexity O(n*2^n).
	 * n = the length of the given array.
	 */
	public static Vector<Integer> wholeLIS(int[] array) {
		Vector<Vector<Integer>> vector = getAllSubArrays(array);
		Vector<Integer> temp = vector.elementAt(0);
		for (int i = 1; i < vector.size(); i++) {
			if ((temp.size() < vector.elementAt(i).size()) && (isSorted(vector.elementAt(i))))
				temp = vector.elementAt(i);
		}
		return temp;
	}
	
	/*
	 * Return all the vector that contain all subarrays of the given array.
	 * Complexity O(2^n).
	 * n = the length of the given array.
	 */
	public static Vector<Vector<Integer>> getAllSubArrays(int[] array) {
		Vector<Vector<Integer>> vector = new Vector<Vector<Integer>>();
		int size = 0;
		for (int i = 0; i < array.length; i++) {
			Vector<Integer> temp = new Vector<Integer>();
			for (int j = 0; j < size; j++) {
				temp = new Vector<Integer>(vector.elementAt(j));
				temp.addElement(array[i]);
				vector.addElement(temp);
				temp = new Vector<Integer>();
			}
			temp.addElement(array[i]);
			vector.addElement(temp);
			size = vector.size();
		}
		return vector;
	}
	
	/*
	 * Checks if vector is sotred. Complexity O(n).
	 * n = length of vector.
	 * Returns true is sorted. false if not.
	 */
	public static boolean isSorted(Vector<Integer> vector) {
		for (int i = 1; i < vector.size(); i++) {
			if (vector.elementAt(i - 1) > vector.elementAt(i)) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {

		int[] array = {1,100,101,2,3,4,5,6,7};
		System.out.println("Whole LIS : " + wholeLIS(array).toString());
	}

}

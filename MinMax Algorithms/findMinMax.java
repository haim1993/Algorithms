import java.util.Arrays;
import java.util.Scanner;

public class findMinMax {

	public static int[] findMinAndMax(int[] array) {

		int min = Math.min(array[0], array[1]), max = Math.max(array[0], array[1]);

		for (int i = 3; i < array.length; i = i + 2) {
			if (max < array[i])
				max = array[i];
			else if (min > array[i])
				min = array[i];
			if (min > array[i - 1])
				min = array[i - 1];
			else if (max < array[i - 1])
				max = array[i - 1];
			if ((i + 1) < array.length) i--;
		}
		int[] arr = new int[2];
		arr[0] = min;
		arr[1] = max;
		return arr;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int[] array = new int[8];
		System.out.println("Please input 8 elements in array : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}

		System.out.println("Array : " + Arrays.toString(findMinAndMax(array)));
	}

}

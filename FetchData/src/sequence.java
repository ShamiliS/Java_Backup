import java.util.Arrays;

public class sequence {
	public static void main(String arg[]) {

		int arr[] = { 2, 7, 1, 8, 2, 8, 1 };
		sortintarr(arr);
		// { 1, 4, 1, 4, 2, 1, 3, 5, 6, 2, 3, 7 }
		// {3,1,4,1,5,9,2,6,5,3,5}
		// {2,7,1,8,2,8,1}
	}

	public static void sortintarr(int[] arrInput) {
		Arrays.sort(arrInput);

		for (int j = 0; j < arrInput.length; j++) {
			System.out.println(arrInput[j]);
		}
	}
}

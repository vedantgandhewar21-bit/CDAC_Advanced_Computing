package JavaPart1Assignment;

public class P043_CheckIfGivenArrayIsSorted {
	public static void main(String[] args) {
		System.out.println("Check If Given Array Is Sorted");
		int[] myArr = ArrayUtility.inputArray();
		boolean isSorted = arrayisSorted(myArr);
		if (isSorted) {
			System.out.println("Aray is soreted");
		} else
			System.out.println("Array is not sorted");
	}

	public static boolean arrayisSorted(int[] arr) {
		int i = 1;
		int small = arr[0];
		while (i < arr.length) {
			if (arr[i] < small) {
				return false;
			}
			small=arr[i];
			i++;
		}
		return true;
	}
}
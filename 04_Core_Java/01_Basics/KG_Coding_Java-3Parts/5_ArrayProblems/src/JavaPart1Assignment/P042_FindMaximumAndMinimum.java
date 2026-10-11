package JavaPart1Assignment;

public class P042_FindMaximumAndMinimum {
	public static void main(String[] args) {
		System.out.println("Find the Maximum and Minimum from the give array ");
		int[] myArr = ArrayUtility.inputArray();
		int maxElement = maxElement(myArr);
		int minElement = minElement(myArr);
		System.out.println("Max element of the array is :"+maxElement);

		System.out.println("Min element of the array is :"+minElement);
	}

	public static int maxElement(int[] arr) {
		int max = arr[0];
		int i = 1;
		while (i < arr.length) {
			if (arr[i] > max) {
				max = arr[i];
			}
			i++;
		}

		return max;
	}

	public static int minElement(int[] arr) {
		int min = arr[0];
		int i = 1;
		while (i < arr.length) {
			if (arr[i] < min) {
				min = arr[i];
			}
			i++;
		}

		return min;
	}

}

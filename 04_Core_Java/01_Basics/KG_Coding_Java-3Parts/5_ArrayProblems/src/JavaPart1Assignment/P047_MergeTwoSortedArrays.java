package JavaPart1Assignment;

import java.util.Scanner;

public class P047_MergeTwoSortedArrays {
	public static void main(String[] args) {
		System.out.println("Merge teo sorted Arrays");

		int[] myArr1 = ArrayUtility.inputArray();
		int[] myArr2 = ArrayUtility.inputArray();
		int[] mergedArray = mergeTwoSortedArrays(myArr1, myArr2);

		ArrayUtility.displayArray(mergedArray);
	}

	public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
		int newSize = arr1.length + arr2.length;
		int[] mergeArr = new int[newSize];
		int i = 0, j = 0, k = 0;
		while (k < mergeArr.length) {
			if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
				mergeArr[k] = arr1[i];
				i++;
				k++;
			} else {
				mergeArr[k] = arr2[j];
				j++;
				k++;
			}

		}
		return mergeArr;
	}
}
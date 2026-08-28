package JavaPart1Assignment;

import java.util.Scanner;

public class P044_DeleteFromArray {
	public static void main(String[] args) {
		System.out.println("Delete a Specific element from array");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the Array : ");
		int size = sc.nextInt();
		int[] myArr = new int[size];
		int i = 0;
		while (i < size) {
			System.out.print("Enter " +(i+1)+ "th element in array : ");
			myArr[i] = sc.nextInt();
			i++;
		}
		System.out.print("Enter the no to delete :");
		int numToDel = sc.nextInt();
		int newArr[]=deleteNumber(myArr,numToDel);
		ArrayUtility.displayArray( newArr);

	}

	public static int[] deleteNumber(int[] numArr, int numToDelete) {
		int occ = P041_NumberOfOccurances.countOccurnaces(numArr, numToDelete);
		if (occ == 0) {
			return numArr;
		}
		int newSize = numArr.length - occ;
		int[] newArr = new int[newSize];

		int i = 0, j = 0;
		while (i < numArr.length) {
			if (numArr[i] != numToDelete) {
				newArr[i] = numArr[j];
				j++;
			}
			i++;
		}
		return newArr;
	}
}

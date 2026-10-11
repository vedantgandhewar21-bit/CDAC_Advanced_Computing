package JavaPart1Assignment;

import java.util.Scanner;

public class P044_DeleteASpecificEleAndReturnArray {
	public static void main(String[] args) {
		System.out.println("Delete A Specific Ele And Return Array");

		Scanner sc = new Scanner(System.in);
		System.out.print("Ente the size of the array :");
		int size = sc.nextInt();
		int[] myArr = new int[size];
		int i = 0;
		while (i < size) {
			System.out.print("Enter the element in Array "+(i+1)+" :");
			myArr[i] = sc.nextInt();
			i++;
		}
		int delNum;
		System.out.print("Enter an number to delete from array :");
		delNum = sc.nextInt();
		//System.out.println("Array after deleting the element " + deletElementFromArray(myArr, delNum));
		deleteElementFromArray(myArr,delNum);
	}

	public static void deleteElementFromArray(int[] arr, int dnum) {
		int i = 0;
		while (i < arr.length) {
			if (arr[i] == dnum) {
				arr[i] = 0;
			}
			i++;
		}
		int j=0;
		while(j<arr.length) {
			System.out.println("New array element "+j+" : "+arr[j]);
			j++;
		}

	}
}

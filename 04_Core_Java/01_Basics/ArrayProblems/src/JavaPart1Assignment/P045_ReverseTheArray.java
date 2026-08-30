package JavaPart1Assignment;

import java.util.Scanner;

public class P045_ReverseTheArray {
public static void main(String[] args) {
	System.out.println("Reverse the Array");
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Size of Element :");
	int size = sc.nextInt();
	int []myArr = new int[size];
	int i=0;
	while(i<myArr.length) {
		System.out.print("Enter the Element in Array: ");
		myArr[i]=sc.nextInt();
		i++;
	}
	 reverseArray(myArr);
	 int j=0;
	 while(j<myArr.length) {
			System.out.println("Reverse array "+myArr[j]);
			
			j++;
		}
	
	
}
public static int[] reverseArray(int[] arr) {
	//int[] revArr=new int[arr.length-1];
	int i=0;
	int temp;
	while(i<arr.length/2) {
		 temp = arr[i];
		 arr[i]=arr[(arr.length-1)-i];
		 arr[(arr.length-1)-i]=temp;
		 i++;
	}
	return arr;
}
}

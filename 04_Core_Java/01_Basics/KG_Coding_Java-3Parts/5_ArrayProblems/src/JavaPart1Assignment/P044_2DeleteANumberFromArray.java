package JavaPart1Assignment;

import java.util.Scanner;

public class P044_2DeleteANumberFromArray {
public static void main(String[] args) {
	System.out.print("Enter the Size of  Array :");
	Scanner sc = new Scanner(System.in);
	int size= sc.nextInt();
	int [] numArray = new int[size];
	
	int i=0;
	//to take nput
	while(i<numArray.length) {
		System.out.print("ente "+(i+1)+"th element :");
		numArray[i]=sc.nextInt();
		i++;
	}
	
	int j=0;
	//to print Array
	while(j<numArray.length) {
		System.out.println("Original Array "+(j+1)+"th element :"+numArray[j]);
		j++;
	}
	System.out.print("now tell,which elemet to delete from an array :");
	int dnum = sc.nextInt();
	System.out.println();
	int [] newArr =deleteElementFromArray(numArray,dnum);
			
	//to print New Array
			int k=0;
	while(k<newArr.length) {
		System.out.println("New Array "+(k+1)+"th element :"+newArr[k]);
		k++;
	}	
	
}
public static int[] deleteElementFromArray(int[] arr,int delnum) {
	  //count Occurances
	int i=0;
	int count=0;
	while(i<arr.length) {
		if(arr[i]==delnum) {
			count++;
		}
		i++;
	}
	int newSize = arr.length-count;
	int newArr[]=new int [newSize];
	
	int k=0,j=0;
	
	while(k<arr.length) {
		if(arr[k]!=delnum) {
			newArr[j]=arr[k];
			j++;
		}
		k++;
	}
	 
	return newArr;
}
}

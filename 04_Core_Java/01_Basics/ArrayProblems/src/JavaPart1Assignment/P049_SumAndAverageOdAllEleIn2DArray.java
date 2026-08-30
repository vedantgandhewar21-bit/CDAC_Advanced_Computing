package JavaPart1Assignment;

import java.util.Scanner;

public class P049_SumAndAverageOdAllEleIn2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2D Array Input Method");
		int[][] my2DArr = ArrayUtility.input2DArray();
		int sizeof2DArr =(my2DArr.length*my2DArr[0].length);
		//System.out.println("2D Arr length :" +(my2DArr.length*my2DArr[0].length));
	    int sumOf2DArr=sumOf2DArrayEle(my2DArr);
	    System.out.println("Sum of 2D Array :"+sumOf2DArr);
	    float avgOf2DArr=avgOf2DArrayEle(sumOf2DArr,sizeof2DArr);
	    System.out.println("Avg of 2D Array :"+avgOf2DArr);
		
}
	public static int sumOf2DArrayEle(int [][]  arr2D) {
		int sum=0;
		System.out.println("Inside Sum of 2D Array :");
		int i=0;
		
		while(i<arr2D.length) {
			int j=0;
			while(j<arr2D[i].length) {
				sum+=arr2D[i][j];
				j++;
			}
			i++;
		}
		return sum;
	}
	public static float avgOf2DArrayEle(int sum,int size) {
	    float avg= 0;
	    
		System.out.println("Inside Avg of 2D Array :");
		avg = (float) (sum/size);
		return avg;
	}
}
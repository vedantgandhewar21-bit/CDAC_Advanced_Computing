package JavaPart1Assignment;

public class P050_SumOfDiagonalEle {
public static void main(String[] args) {
	System.out.println("Sum Of Diagonal Elements");
	int[][] my2DArr=ArrayUtility.input2DArray();
	 int sum = sumOfDiagonals(my2DArr);
	 System.out.println("The sum of Diagonal Final is :"+sum);
}
public static int sumOfDiagonals(int[][]arr2D) {
	//int sum=0;
	int  leftDiagonal=sumOfLeftDiagonal(arr2D);
	System.out.println("Sum of Left Daigonal :"+leftDiagonal);
	int  rightDiagonal=sumOfRightDiagonal(arr2D);
	System.out.println("Sum of Right Daigonal :"+rightDiagonal);
	
	int  sumOfDiagonal=leftDiagonal+rightDiagonal;
	System.out.println("Sum of  Daigonal and repeated element :"+sumOfDiagonal);
	int sizeof2DArr =(arr2D.length*arr2D[0].length);
	
	if((sizeof2DArr%2)!=0) {
		int i=arr2D.length/2;
		sumOfDiagonal-=arr2D[i][i];
		
	}
	return sumOfDiagonal;
	
}
public static int sumOfLeftDiagonal(int[][]arr2D) {
	int sum=0;
	int i=0;
	while(i<arr2D.length) {
		int j=0;
		while(j<arr2D[0].length) {
			if(i==j)
			sum+=arr2D[i][j];
			j++;
		}
		i++;
	}
	
	return sum;
	
}
public static int sumOfRightDiagonal(int[][]arr2D) {
	int sum=0;
	int i=0;
	while(i<arr2D.length) {
		int j=0;
		while(j<arr2D[0].length) {
			if((i+j)==arr2D.length-1) {
			sum+=arr2D[i][j];
			}
			j++;
		}
		i++;
	}
	return sum;
	
}

}

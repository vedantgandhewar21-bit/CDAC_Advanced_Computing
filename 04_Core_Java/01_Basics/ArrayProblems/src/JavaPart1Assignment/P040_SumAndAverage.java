package JavaPart1Assignment;

public class P040_SumAndAverage {
public static void main(String[] args) {
	System.out.println("Sum and Average of Array");
	
	//int[] myArr= {23,12,24,52,34,13,34,46};
	//int[] myArr= {1,2,3,4,5,6,7,8,9,10};
	int[] myArr=ArrayUtility.inputArray(); // we have created this method  
	int sum = calSum(myArr);
	int avg = calAvg(myArr,sum);
	System.out.println("the sum of the array is : "+sum);
	System.out.println("the sum of the array is : "+avg);
}
public static int calSum(int arr[]) {
	int sum=0;
	int index =0;
	while(index < arr.length) {
		sum+=arr[index];
		index++;
	}
	return sum;
}
public static int calAvg(int arr[],int sum) {
	int avg;
	avg = sum/arr.length;
	return avg;
}
}

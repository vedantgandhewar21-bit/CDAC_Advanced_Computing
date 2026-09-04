package Arrays;

import java.util.Scanner;

public class P189_RotateArrayToRightByKNums {
public static void main(String[] args) {
	System.out.println("LeetCode Problem \n 189 Rotate Array bU K Numbers to Right ");
	int myArr[] = {1,2,3,4,5,6,7};
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of K below 7 ");
	int k = sc.nextInt();
	k=k%myArr.length;
	rotate(myArr,0,myArr.length-1);
	rotate(myArr,0,k-1);
	rotate(myArr,k,myArr.length-1);
	
	    
}

public static void rotate(int[] nums, int i,int j) {
	
	
	while(i<=j) {
    int temp = nums[i];
	nums[i]=nums[j];
	nums[j]=temp;
	i++;
	j--;
	}
	int idx=0;
	while(idx<nums.length) {
	System.out.print(nums[idx]+" ");
	idx++;
	}
	System.out.println("");
}
}

package Arrays;

import java.util.Arrays;

public class P217_ContainsDuplicate {
       public static void main(String[] args) {
		System.out.println("Check if Contains Duplicate");
	//	int [] myArr= {1,2,3,4,5,7};
		int [] myArr= {1,2,3,4,5,1};
		if(checkDuplicate(myArr)) {
			System.out.println("Contains Duplicate");
		}
		else
			System.out.println("Do not contain Duplicate");
		
	}
       public static boolean checkDuplicate(int [] nums) {
    	   Arrays.sort(nums);
    	   for(int i=0;i<nums.length-1;i++) {
    	   if(nums[i]==nums[i+1])
    		   return true;
    		   }
    	   return false;
       }
}

package javaPart1Practice;

public class Array {
	public static void main(String[] args) {
		System.out.println("Array");
		int[] myArr = new int[5];
		int[] myArr2 = { 1, 2, 3, 4, 5, 6,};
		myArr[0] = 77;
		myArr[1] = 34;
		myArr[2] = 27;
		myArr[3] = 89;
		myArr[4] = 73;

		System.out.println(myArr[0]);
		System.out.println(myArr[1]);
		System.out.println(myArr[3]);
		System.out.println(myArr[2]);
		System.out.println(myArr[4]);
		
//		System.out.print(myArr2[0]+" ");
//		System.out.print(myArr2[1]+" ");
//		System.out.print(myArr2[3]+" ");
//		System.out.print(myArr2[2]+" ");
//		System.out.print(myArr2[4]);
		int i=0;
		while( i<5) {
			System.out.print(myArr2[i]+" ");
			System.out.println(myArr[i]+" ");
			i++;
		}
	}
}

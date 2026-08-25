package javaPart1Assignment;

import java.util.Scanner;

public class P032_LowestCommonMultple {
	public static void main(String[] args) {
		System.out.println("LCM");
		int num1 = getNumber();
		int num2 = getNumber();
//		int LCM = calculateLCM(num1, num2);
//		System.out.println("The LCM is :" + LCM);
		int LCM2 = calculateLCM2(num1, num2);
		System.out.println("The LCM is :" + LCM2);
	}

	public static int getNumber() {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number  ");
		return sc.nextInt();
	}
//This will not give correct ans for all values
//	public static int calculateLCM(int n1, int n2) {
//		int i;
//		for (i = 1; i <= n1; i++) {
//			int ires = i * n1;
//			int j;
//			for (j = 1; j <= n2; j++) {
//				int jres = j * n2;
//				if (ires == jres) {
//					return ires;
//				}
//			}
//		}
//		return 0;
//	}

	public static int calculateLCM2(int n1, int n2) {
		int i = 1;
		while (i <= n1 * n2) {
			if (i % n1 == 0 && i % n2 == 0) {

				return i;
			}
			i++;
		}

		return 0;
	}

}

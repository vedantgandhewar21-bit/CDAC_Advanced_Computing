package Package_04_Patterns;

import java.util.Scanner;

//take n as input and print 
/*n=4
 * 1234
 * 1234
 * 1234
 * 1234
 * */
public class HW_03Rectangle2 {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number :");
 int n = sc.nextInt();
 for(int i=1;i<=n;i++) {
	 for(int j=1;j<=n;j++) {
		 System.out.print(j+" ");
	 }
	 System.out.println();
 }
}
}

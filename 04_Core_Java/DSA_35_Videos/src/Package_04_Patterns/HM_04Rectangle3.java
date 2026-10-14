package Package_04_Patterns;
import java.util.Scanner;
public class HM_04Rectangle3 {

//take n as input and print 
/*n=4
 * ABCD
 * ABCD
 * ABCD
 * ABCD
 * */

public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number :");
 int n = sc.nextInt();
 for(int i=1;i<=n;i++) {
	 for(int j=65;j<65+n;j++) {
		 System.out.print((char)j+" ");
	 }
	 System.out.println();
 }
}
}

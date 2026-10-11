package Package_03_Loops;

public class HM_04AlloddNoDivisbleBy3 {
public static void main(String[] args) {
	int count=0;
	for(int i=1;i<100;i++) {
		if(i%2!=0) {
			if(i%3==0) {
				System.out.print(i+" ");
				count++;
			}
		}
	}
	System.out.println("\nTotal Odd no divisble by 3 = "+count);
}
}

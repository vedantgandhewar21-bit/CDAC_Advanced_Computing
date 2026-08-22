
public class patter2 {


public static void main(String[] args) {
	System.out.println("Printing pattern using loop");
	System.out.println("*");
	System.out.println("* *");
	System.out.println("* * *");
	System.out.println("* * * *");
	System.out.println("* * * * *");
	System.out.println("------------------------");

	 
	int row;
	row = 5;
	int i=1;
	
	while(i<=row) {
		System.out.println(" #");
		int j=1;
		while(j<=i) {
			System.out.print(" #");
			j++;
		}
		
		i++;
	}
	}
	
}


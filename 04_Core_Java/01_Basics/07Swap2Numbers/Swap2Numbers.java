
public class Swap2Numbers {
public static void main(String[] args) {
	System.out.println("Swaping 2 numbers");
	int num1 = 5;
	int num2 = 11;
	System.out.println("num1 before swap = "+num1);
	System.out.println("num2 before swap = "+num2);
	int temp;
	temp = num1;
	num1= num2;
	num2 = temp;
	System.out.println("num1 after swap = "+num1);
	System.out.println("num2 after swap = "+num2);
}
}

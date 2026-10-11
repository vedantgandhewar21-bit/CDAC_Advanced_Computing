package Package_02_If_Else;

import java.util.Scanner;

public class Pr_9gratestOfThree {
public static void main(String[] args) {
	//Gratest of three
	Scanner sc = new Scanner(System.in);
	int a,b,c;
    System.out.print("Enter a number a:");
    a = sc.nextInt();
    System.out.print("Enter a number b:");
    b = sc.nextInt();
    System.out.print("Enter a number c:");
    c = sc.nextInt();
    
    if(a>b &&a>c)System.out.println(a);
    else if(b>a &&b>c)System.out.println(b);
    if(c>a &&c>b)System.out.println(c);
}
}

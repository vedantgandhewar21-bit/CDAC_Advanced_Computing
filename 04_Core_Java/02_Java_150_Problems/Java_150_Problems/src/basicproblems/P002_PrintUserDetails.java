package basicproblems;

import java.util.Scanner;

public class P002_PrintUserDetails {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your Name :");
    String name = sc.nextLine();
    System.out.print("Enter Your age :");
    int age = sc.nextInt();
    System.out.println("Name = "+name);
    System.out.println("Age  = "+age);
  
  }
}

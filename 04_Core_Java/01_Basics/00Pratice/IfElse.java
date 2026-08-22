
public class IfElse {
	public static void main(String[] args) {
		System.out.println("If Else");
		boolean isSeniorCitizen = false;//true
		boolean isAdult = false;//true

		if (isSeniorCitizen) {
			System.out.println("Welcome SeniorCitizen ");
		} else if (isAdult) {
			System.out.println("Welcome Adult");
		} else {
			System.out.println("Welcome Child ");
		}
	}
}

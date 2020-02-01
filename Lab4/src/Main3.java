import java.util.Scanner;
public class Main3 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		String SSN = input.nextLine();
		
		System.out.println("Enter a SSN: " + SSN);
		
		if(SSN.indexOf("-") == 3 && SSN.indexOf("-") == 6) {
			System.out.println(SSN + " is a valid social security number");
		}
		
		else {
			System.out.println(SSN + " is an invalid social security number");
		}
	}
}


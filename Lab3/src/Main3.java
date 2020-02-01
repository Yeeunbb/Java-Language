import java.util.Scanner;
import java.io.*;

public class Main3 {
	public static boolean isStringDouble(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean isValidPassword(String s) {
		int digits = 0;
		int characters = 0;
		char[] arr = new char[s.length()];
		for(int i=0; i<s.length(); i++) {
			arr[i] = s.charAt(i);
			if(!Character.isLetterOrDigit(arr[i])) {
				return false;
			}
			if(isStringDouble(Character.toString(arr[i]))){
				digits++;
			}
		}
		
		if(digits>=2 && s.length()>=8) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String password = input.nextLine();
		
		if(isValidPassword(password)) {
			System.out.print("Valid password");
		}
		else {
			System.out.print("Invalid password");
		}
	}
}

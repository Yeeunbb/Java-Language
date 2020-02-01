import java.util.Scanner;
import java.lang.Exception;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String hex = input.nextLine();
		
		try {
			System.out.println(hex2Dec(hex));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (HexFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
		input.close();

	}
	
	public static int hex2Dec(String hex) throws NumberFormatException, HexFormatException{
		int decimalValue = 0;
		for(int i=0; i<hex.length(); i++) {
			if((hex.charAt(i) >='0' && hex.charAt(i) <='9') || (hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F')) {
				char hexChar = hex.charAt(i);
				decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
			}
			else {
				throw new HexFormatException(hex.charAt(i));
			}
		}
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else 
			return ch - '0';
	}
}

class HexFormatException extends Exception {
	private String k="";
	public HexFormatException(char x) {
		k+=x;
	}
	public String toString() {
		return "Illegal hex character: " + this.k;
	}
}

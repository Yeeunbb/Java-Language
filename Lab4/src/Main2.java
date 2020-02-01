import java.util.Scanner;

public class Main2 {
/*	public String FindD10 (String digits) {
		int NineDigits = Integer.parseInt(digits);
		int[] d = new int[9];
		for(int i=9; i>1; i--) {
			d[i] = NineDigits % 10;
			NineDigits /= 10;
			d[10] += d[i]*i;
		}
		if(NineDigits > 0) {
			d[1] = NineDigits;
			d[10] += d[1];
		}
		else {
			d[1] = 0;
			d[1] += d[1];
		}
		String D10 = String.valueOf(d[10]);
		return D10;		
	}*/
	
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		String nineDigits = input.nextLine();
		
		System.out.println("Enter the first 9 digits of an ISBN as integer: " + nineDigits);
		/*study2 a = new study2();
		String D10 = a.FindD10(nineDigits);
		String result = nineDigits + D10;
		System.out.println("The ISBN-10 number is " + result);*/
		int NineDigits = Integer.parseInt(nineDigits);
		
		if (nineDigits.indexOf("0") == 0)
		{
			int d9 = NineDigits % 10;
			int d8 = (NineDigits / 10) % 10;
			int d7 = (NineDigits / 100) % 10;
			int d6 = (NineDigits / 1000) % 10;
			int d5 = (NineDigits / 10000) % 10;
			int d4 = (NineDigits / 100000) % 10;
			int d3 = (NineDigits / 1000000) % 10;
			int d2 = (NineDigits / 10000000) % 10;
			int d1 = 0;
			
			int d10 = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9)%11;
			if(d10 == 10) {
				String D10 = "X";
				String result = nineDigits + D10;
				System.out.println("The ISBN-10 number is " + result);
			}
			else {
				String D10 = String.valueOf(d10);
				String result = nineDigits+D10;
				System.out.println("The ISBN-10 number is " + result);
			}			
		}
		
		else {
			int d9 = NineDigits % 10;
			int d8 = (NineDigits / 10) % 10;
			int d7 = (NineDigits / 100) % 10;
			int d6 = (NineDigits / 1000) % 10;
			int d5 = (NineDigits / 10000) % 10;
			int d4 = (NineDigits / 100000) % 10;
			int d3 = (NineDigits / 1000000) % 10;
			int d2 = (NineDigits / 10000000) % 10;
			int d1 = (NineDigits / 100000000) % 10;
			
			int d10 = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9)%11;
			if(d10 == 10) {
				String D10 = "X";
				String result = nineDigits + D10;
				System.out.println("The ISBN-10 number is " + result);
			}
			else {
				String D10 = String.valueOf(d10);
				String result = nineDigits+D10;
				System.out.println("The ISBN-10 number is " + result);
			}	
		}
		input.close();
	}
}

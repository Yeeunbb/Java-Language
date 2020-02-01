import java.util.Scanner;
public class Main2 {
	public static int reverse(int number) {
		int result = 0;
		while(number!=0) {
			result = result * 10 + number % 10;
			number /= 10;
		}
		return result;
	}
	
	public static boolean isPalindrome(int number) {
		if(number == reverse(number)) {
			return true;
		}
		else {
			return false;
		}
		/*String num = String.valueOf(number);
		int r_num = reverse(number);
		String num_r = String.valueOf(r_num);
		char[] arr = new char[num.length()];
		char[] brr = new char[num_r.length()];
		int mid = (num.length()/2);
		int j = 0;
		
		for(int i=0; i<num.length(); i++) {
			arr[i] = (num.charAt(i));
			brr[i] = (num_r.charAt(i));
			System.out.println(arr[i] + " and brr " + brr[i]);
		}
		
		for(int i=mid; i<num.length(); i++) {
			if(arr[i] != brr[j]) {
				return false;
			}
			System.out.println(arr[i] + " for2 brr " + brr[i]);
			j++;
		}
		
		return true;*/
	}
	
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if(isPalindrome(num)) {
			System.out.print(num + " is a palindrome");
		}
		else {
			System.out.print(num + " is not a palindrome");
		}
	}
}

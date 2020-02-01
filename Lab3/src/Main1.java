import java.util.Scanner;
public class Main1 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		System.out.println("Enter the number of lines: " + num);
		
		for(int i=1; i<=num; i++) {
			for(int j=i; j<num; j++) {
				System.out.print("   ");
			}
			for(int k=i; k>0; k--) {
				System.out.print("  " + k);
			}
			for(int l=2; l<=i; l++) {
				System.out.print("  " + l);
			}
			System.out.print("\n");
		}
	}
}


/*
import java.io.*;
import java.util.Scanner;
class Main {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		System.out.println("Enter the number of lines: ");
		
		for(int i=1; i<=num; i++) {
			for(int j=i; j<num; j++) {
				System.out.print("   ");
			}
			for(int k=i; k>0; k--) {
				if(k>=10){
					System.out.print(" " + k);
				}
				else{
					System.out.print("  " + k);
				}
			}
			for(int l=2; l<=i; l++) {
				if(l>=10){
					System.out.print(" " + l);
				}
				else{
					System.out.print("  " + l);
				}
			}
			System.out.print("\n");
		}
	}
} 
*/
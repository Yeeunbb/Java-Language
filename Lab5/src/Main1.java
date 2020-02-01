import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double [][] matrix = new double[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		sortRows(matrix);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		input.close();
	}

	private static void sortRows(double [][] m) {
		// TODO Auto-generated method stub
		Arrays.sort(m[0]);
		Arrays.sort(m[1]);
		Arrays.sort(m[2]);
	}
}

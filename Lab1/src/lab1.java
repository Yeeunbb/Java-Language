import java.util.Scanner;

public class lab1 { //객체지향프로그래밍 

	public static void main(String[] args) { //class는 추가되지만, public class는 하나만 가능
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double myWeight = input.nextDouble();
		double myHeight = input.nextDouble();
		myHeight *= 0.01;
		
		double BMI = (myWeight) / (myHeight * myHeight);
		
		if (BMI< 18.5) {
			System.out.println("Underweight");
		}
		
		else if(18.5 <= BMI&& BMI < 25.0) {
			System.out.println("Normal");
		}
		
		else if(25.0 <= BMI && BMI < 30.0) {
			System.out.println("Overweight");
		}
		
		else {
			System.out.println("Obese");
		}
		
		input.close();
	}

}

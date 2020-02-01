import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class Main1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		String color = input.next();
		boolean f = input.nextBoolean();
		
		Triangle t = new Triangle(s1, s2, s3, color, f);
		
		System.out.println(t.toString());
		System.out.println("area of Triangle: " + t.getArea());
		System.out.println("perimeter of Triangle: " + t.getPerimeter());
		System.out.println("color of Triangle: " + t.getColor());
		System.out.println("is Filled that Triangle: " + t.isFilled());
		
		
		input.close();
	}

}

class Triangle extends GeometricObject{
	double side1, side2, side3;
	
	Triangle(double a, double b, double c, String d, boolean f){
		side1 = a;
		side2 = b;
		side3 = c;
		color = d;
		filled = f;
	}
	Triangle(){
		side1 = 0;
		side2 = 0;
		side3 = 0;
	}
	
	double getS1() {
		return side1;
	}
	
	double getS2() {
		return side2;
	}
	
	double getS3() {
		return side3;
	}
	
	double getArea() {
		double s = (side1+side2+side3) / 2.0;
		double result;
		result = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		result = Math.floor(result*1000);
		return result / 1000;
	}
	
	double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString() {
		return "Triangle: side = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}

class GeometricObject{
	String color;
	boolean filled;
	
	GeometricObject(){
		color = "while";
		filled = false;
	}
	
	GeometricObject(String c, boolean f){
		color = c;
		filled = f;
	}
	
	String getColor() {
		return color;
	}
	
	boolean isFilled() {
		return filled;
	}

	
}

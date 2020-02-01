import java.util.Scanner;

class Rectangle{
	double width;
	double height;
	
	Rectangle() {
		width = 1;
		height = 1;
	}
	
	Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	double getArea() {
		double Area = width*height;
		double area = Math.floor(Area*10);
		return area/10;
	}
	
	double getPerimeter() {
		return 2*(width+height);
	}
}

public class Main2 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Rectangle R1 = new Rectangle();
	Rectangle R2 = new Rectangle();
	
	R1.width = input.nextDouble();
	R1.height = input.nextDouble();
	R2.width = input.nextDouble();
	R2.height = input.nextDouble();
	
	System.out.println("Rectangle1:");
	System.out.println("width: " + R1.width + " height: " + R1.height);
	System.out.println("area: " + R1.getArea() + " perimeter: " + R1.getPerimeter());

	System.out.println("Rectangle2:");
	System.out.println("width: " + R2.width + " height: " + R2.height);
	System.out.println("area: " + R2.getArea() + " perimeter: " + R2.getPerimeter());

	input.close();
	}
}

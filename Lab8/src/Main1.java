import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		Circle myC = new Circle();
		Rectangle myR = new Rectangle();
		Triangle myT = new Triangle();
		
		/*
		for(int i=0; i<3; i++) {
			str = input.nextLine();
			if(str == "Circle") {
				double radius = input.nextDouble();
				myC.setRadius(radius);
			}
			else if(str == "Rectangle") {
				double width = input.nextDouble();
				double height = input.nextDouble();
				myR.setWidth(width);
				myR.setHeight(height);
			}
			else if(str == "Triangle") {
				double s1 = input.nextDouble();
				double s2 = input.nextDouble();
				double s3 = input.nextDouble();
				myT.setSide1(s1);
				myT.setSide2(s2);
				myT.setSide3(s3);
			}
		}
		/*/
		str = input.next();
		double radius = input.nextDouble();
		myC.setRadius(radius);
		
		str = input.next();
		double width = input.nextDouble();
		double height = input.nextDouble();
		myR.setHeight(height);
		myR.setWidth(width);

		str = input.next();
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		myT.setSide1(s1);
		myT.setSide2(s2);
		myT.setSide3(s3);

		System.out.println("The Area of Circle: " + myC.getArea());
		System.out.println("The Area of Rectangle: " + myR.getArea());
		System.out.println("The Area of Triangle: " + myT.getArea());
		
		if((myC.compareTo(myR)) == 0) {//Circle > Rectangle
			if((myC.compareTo(myT) == 0)) {
				System.out.println("The Circle has largest area.");
				if((myR.compareTo(myT)) == 0) {//Circle>Rectangle>Triangle
					System.out.println("The Rectangle has second largest area.");
				}
				else {//Circle>Triangle>Rectangle
					System.out.println("The Triangle has second largest area.");
				}
			}
			else {//Triangle > Circle > Rectangle
				System.out.println("The Triangle has largest area.");
				System.out.println("The Circle has second largest area.");
			}
		}
		else { //Rectangle > Circle
			if((myR.compareTo(myT)) == 0) {
				System.out.println("The Rectangle has largest area.");
				if((myC.compareTo(myT)) == 0) {//Rectangle>Circle>Triangle
					System.out.println("The Circle has second largest area.");
				}
				else {//Rectangle>Triangle>Circle
					System.out.println("The Triangle has second largest area.");
				}
			}
			else {//Triangle>Rectangle>Circle
				System.out.println("The Triangle has largest area.");
				System.out.println("The Rectangle has second largest area.");
			}
		}
		
	
		input.close();
	}
}

abstract class GeometricObject 
		implements Comparable<GeometricObject> {
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
	@Override
	public int compareTo(GeometricObject arg) {
		if(this.getArea()>arg.getArea()) 
			return 0;
		else
			return 1;
	}
	
	abstract double getArea();
	abstract double getPerimeter();
}

class Circle extends GeometricObject {
	double radius;
	Circle(){
		radius = 1;
	}
	Circle(double r){
		radius = r;
	}
	double getRadius() {
		return radius;
	}
	void setRadius(double r) {
		radius = r;
	}
	double getArea() {
		double result = radius*radius*Math.PI;
		result = Math.floor(result*1000);
		return result/1000;
	}
	double getPerimeter() {
		return 2*radius*Math.PI;
	}
}

class Rectangle extends GeometricObject{
	double width;
	double height;
	Rectangle(){
		width = 1;
		height = 1;
	}
	Rectangle(double w, double h){
		width = w;
		height = h;
	}
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	void setWidth(double w) {
		width = w;
	}
	void setHeight(double h) {
		height = h;
	}
	double getArea() {
		double result = width * height;
		result = Math.floor(result*1000);
		return result/1000;
	}
	double getPerimeter() {
		return 2*(width+height);
	}
}

class Triangle extends GeometricObject {
	double side1, side2, side3;
	Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	Triangle(double s1, double s2, double s3){
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	double getSide1() {
		return side1;
	}
	double getSide2() {
		return side2;
	}
	double getSide3() {
		return side3;
	}
	void setSide1(double s) {
		side1 = s;
	}
	void setSide2(double s) {
		side2 = s;
	}
	void setSide3(double s) {
		side3 = s;
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
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}

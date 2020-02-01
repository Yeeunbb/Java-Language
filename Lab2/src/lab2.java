import java.util.Scanner;

public class lab2 {
	public static void main(String[] args) {
	Scanner inPut = new Scanner(System.in);
	double pi = Math.PI;
	double e = Math.E;	
	double raDian = Math.toRadians(90);
	
	double pw = Math.pow(3, 2);
	if(pw!=0) {
	System.out.println("pi = " + pi);
	
	double ranDom = Math.random();
	ranDom *= 100;
	System.out.println("random =" + ranDom);
		}	
	
	String str=new String("welcome");
	String str2 = "I'm yeeun";
	str.concat(str2);
	
	char ch = Character.toLowerCase('A');
	
	inPut.close();
	}
}

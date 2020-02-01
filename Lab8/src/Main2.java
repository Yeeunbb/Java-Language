import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		int year = input.nextInt();
		String str=" ";
		
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		switch(month) {
		case 1: str = "January"; break;
		case 2: str = "February"; break;
		case 3: str = "March"; break;
		case 4: str = "April"; break;
		case 5: str = "May"; break;
		case 6: str = "June"; break;
		case 7: str = "July"; break;
		case 8: str = "Agust"; break;
		case 9: str = "September"; break;
		case 10: str = "October"; break;
		case 11: str = "November"; break;
		case 12: str = "December"; break;
		}
		
		System.out.println(str + ", " + year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		int day = cal.get(Calendar.DAY_OF_WEEK);
		int lastday = cal.getActualMaximum(Calendar.DATE);
		
		if(day == 1) {//1老 = Sunday
			for(int i=1; i<=lastday; i++) {
				if(i<10) {
					if(i==7) System.out.println("   " + i);
					else System.out.print("   " + i);
				}
				else {
					if(i%7==0) System.out.println("  " + i); 
					else System.out.print("  " + i);
				}
			}
		}
	
		else if(day == 2) {//1老 = Monday
			for(int i=1; i<=lastday; i++) {
				if(i<10) {
					if(i==1) System.out.print("       " + i);
					else if(i%7==6) System.out.println("   " + i);
					else System.out.print("   " + i);
				}
				else {
					if(i%7==6) System.out.println("  " + i); 
					else System.out.print("  " + i);
				}
			}
		}

		if(day == 3) {//1老 = Tuesday
			for(int i=1; i<=lastday; i++) {
				if(i<10) {
					if(i==1)System.out.print("           " + i);
					else if(i%7==5) System.out.println("   " + i);
					else System.out.print("   " + i);
				}
				else {
					if(i%7==5) System.out.println("  " + i); 
					else System.out.print("  " + i);
				}
			}
		}
		
		if(day == 4) {//1老 = Wednesday
			for(int i=1; i<=lastday; i++) {
				if(i<10) {
					if(i==1) System.out.print("               " + i);
					else if(i%7==4) System.out.println("   " + i);
					else System.out.print("   " + i);
				}
				else {
					if(i%7==4) System.out.println("  " + i); 
					else System.out.print("  " + i);
				}
			}
		}

		if(day == 5) {//1老 = Thursday
			for(int i=1; i<=lastday; i++) {
				if(i<10) {
					if(i==1)System.out.print("                   " + i);
					else if(i%7==3) System.out.println("   " + i);
					else System.out.print("   " + i);
				}
				else {
					if(i%7==3) System.out.println("  " + i); 
					else System.out.print("  " + i);
				}
			}
		}
		
		if(day == 6) {//1老 = Friday
			for(int i=1; i<=lastday; i++) {
				if(i<10) {
					if(i==1) System.out.print("                       " + i);
					else if(i%7==2) System.out.println("   " + i);
					else System.out.print("   " + i);
				}
				else {
					if(i%7==2) System.out.println("  " + i); 
					else System.out.print("  " + i);
				}
			}
		}
		
		if(day == 7) {//1老 = Saturday
			for(int i=1; i<=lastday; i++) {
				if(i<10) {
					if(i==1) System.out.println("                           " + i);
					else if(i%7==1) System.out.println("   " + i);
					else System.out.print("   " + i);
				}
				else {
					if(i%7==1) System.out.println("  " + i); 
					else System.out.print("  " + i);
				}
			}
		}
		
		
		input.close();
	}

}

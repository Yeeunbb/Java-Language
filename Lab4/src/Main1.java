import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		int nowDay = input.nextInt();
		int futureDay = input.nextInt();
		
		System.out.println("Enter today's day: " + nowDay);
		System.out.println("Enter the number of days elapsed since today: " + futureDay);
		
		String NowDay = "";
		String FutureDay= "";
		
		nowDay %= 7;
		
		switch(nowDay) {
		case 0: NowDay = "Sunday";
			break;
		case 1: NowDay = "Monday";
			break;
		case 2: NowDay = "Tuesday";
			break;
		case 3: NowDay = "Wednesday";
			break;
		case 4: NowDay = "Thursday";
			break;
		case 5: NowDay = "Friday";
			break;
		case 6: NowDay = "Saturday";
			break;
		}
		
		futureDay = (futureDay + nowDay)%7;
		
		switch(futureDay) {
		case 0: FutureDay = "Sunday";
			break;
		case 1: FutureDay = "Monday";
			break;
		case 2: FutureDay = "Tuesday";
			break;
		case 3: FutureDay = "Wednesday";
			break;
		case 4: FutureDay = "Thursday";
			break;
		case 5: FutureDay = "Friday";
			break;
		case 6: FutureDay = "Saturday";
			break;
		}
		
		System.out.println("Today is "+NowDay+" and the future day is "+FutureDay);
		input.close();
	}
}

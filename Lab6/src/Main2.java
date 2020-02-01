import java.util.Scanner;
import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		int g = input.nextInt();
		int h = input.nextInt();
		int i = input.nextInt();
		int j = input.nextInt();
		
		arrayList.add(Integer.toString(a));
		arrayList.add(Integer.toString(b));
		arrayList.add(Integer.toString(c));
		arrayList.add(Integer.toString(d));
		arrayList.add(Integer.toString(e));
		arrayList.add(Integer.toString(f));
		arrayList.add(Integer.toString(g));
		arrayList.add(Integer.toString(h));
		arrayList.add(Integer.toString(i));
		arrayList.add(Integer.toString(j));
		
		for(int n=0; n<10; n++) {
			if(n%2==0) {
				int newNum;
				newNum = Integer.parseInt(arrayList.get(n));
				newNum *= 2;
				arrayList.remove(n);
				arrayList.add(n,(Integer.toString(newNum)));
			}
		}
		
		arrayList.remove(3);
		arrayList.remove(4);
		arrayList.remove(5);
		
		arrayList.add(1, "101");
		arrayList.add(3, "102");
		arrayList.add(5, "103");
		
		for(int n=0; n<10; n++) {
			System.out.println(arrayList.get(n));
		}

		input.close();
	}
}


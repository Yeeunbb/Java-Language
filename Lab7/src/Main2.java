import java.util.Scanner;
import java.io.File;
import java.util.StringTokenizer;
import java.io.FileNotFoundException;

public class Main2 {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String FileName = input.nextLine();            
		
		File file = new File(FileName);
		Scanner in = new Scanner(file);
		
		int characterCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		//int cnt=0;
		
		while(in.hasNextLine()) {
			String s = in.nextLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			wordCount += st.countTokens();
			lineCount++;
			characterCount += s.length()+2;
			/* 
				wordCount += s.split(" ").length;
			if(s.length() == 0)
				wordCount -= 1; */
		}
		
		System.out.println("File " + FileName + " has ");
		System.out.println(characterCount + " characters");
		System.out.println(wordCount + " words");
		System.out.println(lineCount + " lines");
		input.close();
		in.close();
	}

}

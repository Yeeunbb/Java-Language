import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryIODemo {

	public static void main(String[] args) {
		try {//무조건 try/catch 로 묶어줘야한다. 
			
//			FileOutputStream outputStream = new FileOutputStream("temp.dat");
			
//			DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("temp.dat"));
			//dataoutputstream 이라는 필터를 달아주면 일부만 보여주는 거다. 1바이트씩. 

			BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("17slide_Binary IO_필기.pptx"));
					
			BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("copyslide.pptx"));
			
			int r;
			int numberOfBytesCopied = 0;
			while((r = inputStream.read()) != -1) {
				outputStream.write((byte)r);
				numberOfBytesCopied++;
			}
			
			outputStream.flush();
//			
//			for(int i=0; i<=10; i++)
//				outputStream.writeInt(i);
			
//			FileInputStream inputStream = new FileInputStream("temp.dat");
//			DataInputStream inputStream = new DataInputStream(new FileInputStream("temp.dat"));
//			
//			for(int i=0; i<=10; i++) {
//				int value = inputStream.readInt();
//				System.out.println("read value: " + value);
//			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

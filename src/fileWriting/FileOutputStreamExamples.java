package fileWriting;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStreamExamples {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * FileOutputStream - for writing raw byte array information (eg. images)
		 */
		
		String location="UsingFOS.txt";
		
		String content="Learning JAVA is simple! by FOS";
		
		//FileWriter fileWriter = new FileWriter(location);
		
		FileOutputStream fileOutputStream = new FileOutputStream(location);
		
		byte[] writeThis = content.getBytes(); // ot will get the contents and change it to byte array
		
		fileOutputStream.write(writeThis);
		
		fileOutputStream.close();
		
		
	}

}

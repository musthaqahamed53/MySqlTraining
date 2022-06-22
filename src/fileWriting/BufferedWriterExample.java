package fileWriting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * Buffered writer - easiest way, performance wise better and widely used
		 */
		
		
		
		String location="UsingBufferedWriter.txt";
		
		String content="Learning JAVA is simple! by BUFFERED WRITER";
		
		FileWriter fileWriter = new FileWriter(location);
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write(content);
		
		bufferedWriter.close();
		
		
		
	}

}

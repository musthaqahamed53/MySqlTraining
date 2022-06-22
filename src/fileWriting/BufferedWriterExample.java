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
		
		//1. file location 		
		//2. file content
		//create object for file writer (location)
		//create object for buffered writer (filewriter)
		//write the content
		//close the file
				
		String location="UsingBufferedWriter.txt";
		
		String content="Learning JAVA is simple! by BUFFERED WRITER \nNext line\nThird line";
		
		FileWriter fileWriter = new FileWriter(location);
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write(content);
		
		bufferedWriter.close();
		
		
		
	}

}

package fileWriting;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * file writer - straightforward, direct interaction with files less performance
		 */
		
		//1. file location 		
		String location="UsingFileWriter.txt";
		
		//2. file content
		String content="Learning JAVA is simple!";
		
		//create object for file writer
		FileWriter fileWriter = new FileWriter(location);
		
		//write the content
		fileWriter.write(content);
		
		//close the file
		fileWriter.close();
		
		
		
		
		
	}

}

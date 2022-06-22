package fileReading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExamples {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="UsingBufferedWriter.txt";
		
		FileReader fileReader = new FileReader(location);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String currentLine;
		 
		while((currentLine = bufferedReader.readLine())!=null){
			
			System.out.println(currentLine);
		}
		
	}

}

package fileWriting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class pathExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		/*
		 * path - for writing raw byte array information (eg. images)
		 */
		
		String location="UsingPath.txt";
		
		String content="Learning JAVA is simple! by path";
		
		Path path = Paths.get(location);
		
		Files.write(path,content.getBytes());
		
		
	}

}
